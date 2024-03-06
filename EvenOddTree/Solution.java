package EvenOddTree;

import java.util.ArrayList;

import HELPER_CLASSES.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {

    /*** SOLUTION ***
     * Given the nature of a tree, iterating through based on a horizantal "levels" or distinctive heights pattern is a bit harder than going vertical.
     * So, to offset this, we can iterate vertically but keep track of our current level via a recursive method.
     *      i.e. each time the method calls itself, it increases the level.
     * To make sure while iterating we are keep track of values increasing or decreasing, we can use a list structure to keep track of values at different levels.
     * If we iterate in a "left-first, deepest first" fasion, then for any level we encounter we well encounter nodes in the order they appear left to right.
     * This way, we only need to keep track of the most recent value we have encountered in a level, and compare it to any new value we find for that level.
     * 
     * Preserving the conditions in the description, we can keep track of whether nodes have opposite parity of their level by comparing them accordingly as we encounter them.
     * If that condition holds true, then we can compare it to the previous node we encountered in that level- if any -and compare the difference according to the level parity.
     * 
     * Assuming these conditions hold true, we return true after parsing through the tree, or false otherwise.
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      Where n is the number of nodes in the tree rooted at root
     * - Space complexity:
     *      O(log(n))
     *      In the average case where the tree is relatively balanced, we store a val for each level we encounter
     *      O(n)
     *      In the worst case if the tree is not balanced and has a single path from the root going through each node
    */
    public static ArrayList<Integer> levels;

    public static boolean isEvenOddTree(TreeNode root) {
        levels = new ArrayList<Integer>();
        return scan(root, 0);
    }

    public static boolean scan(TreeNode n, int depth){
        boolean isEven = n.val % 2 == 0;
        if(isEven == (depth % 2 == 0)){
            return false;
        } else {
            if(depth + 1 > levels.size()){
                levels.add(n.val);
            } else if((isEven && n.val < levels.get(depth)) || (!isEven && n.val > levels.get(depth))){
                levels.set(depth, n.val);
            } else {
                return false;
            }

            boolean isEvenOdd = true;
            if(n.left != null){
                isEvenOdd = scan(n.left, depth + 1);
            }

            if(n.right != null){
                isEvenOdd = scan(n.right, depth + 1) && isEvenOdd;
            }
            return isEvenOdd;
        }
    }

    public static void main(String args[]){
        TreeNode n = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,null,null,null,null,15}, 0);
        System.out.println(isEvenOddTree(n));
    }
}
