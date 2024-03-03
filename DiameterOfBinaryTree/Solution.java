package DiameterOfBinaryTree;

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
     * Given a node n, the longest path running through n is the sum of the heights of its branches.
     * In other words, if on the left of n, the tree has a height of 6, and on the right a height of 5, then the longest path running through n is of size 11.
     * 
     * Utilizing this property, for each node in the tree, we can recursively search each node and retrieve the diameter of each.
     * We keep track of the diameter via the variable distance, and consistently set it to the max value we find.
     * 
     * To calculate the diameter at a given node, we use the getLowest method, which returns the height of the tree.
     * 
     * Complexity
     * - Time complexity:
     *      O(nlog(n))
     *      Where n is the number of nodes in the tree rooted at root
     *      We go through each node to get its diameter, and for each node it takes log(n) time to get the height.
     * - Space complexity:
     *      O(log(n))
     *      As we may have a whole "branch" of the tree stored at a given moment during runtime due to the recursion.
     *      i.e. there may be log(n) storage instances of the method at a given time.
    */
    public static int diameterOfBinaryTree(TreeNode root) {
        int distance = 0;
        int leftDepth = 0, rightDepth = 0;
        if(root.left != null){
            leftDepth = getLowest(root.left, 1);
            distance = diameterOfBinaryTree(root.left);
        }

        if(root.right != null){
            rightDepth = getLowest(root.right, 1);
            distance = Math.max(diameterOfBinaryTree(root.right), distance);
        }

        distance = Math.max(leftDepth + rightDepth, distance);
        return distance;
    }

    /**
     * This is a helper method that, given a treenode n, returns the height of the tree rooted at n.
     * 
     * @param n
     *      The treenode of which we are traversing to get the height
     * @param depth
     *      The current depth which we have dived
     * @return
     *      The maximum depth reachable from n, also known as the height of n
     */
    public static int getLowest(TreeNode n, int depth){
        int leftDepth = depth, rightDepth = depth;

        if(n.left != null){
            leftDepth = getLowest(n.left, depth+1);
        }
        if(n.right != null){
            rightDepth = getLowest(n.right, depth+1);
        }
        depth = Math.max(leftDepth,rightDepth);
        return depth;
    }

    public static void main(String args[]){
        TreeNode n = TreeNode.constructTree(new int[]{1,2,3,4,5,6,7,8,9,10,0,0,0,0,15}, 0);
        System.out.println(diameterOfBinaryTree(n));
    }
}
