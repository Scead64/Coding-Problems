package FindBottomLeftTreeValue;

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
     * To get the lowest left value, we parse through the tree using the static variables maxDepth and lowestLeftVal, which store the lowest height we've reached and answer respectively.
     * As we search through the tree, we search by a left first and depth first pattern so that, once we reach a certain height, the first node we reach is the left most node at that height.
     * At each node, we check the current height against our max height recursively (that is, after diving) and if it is ever greater, we set our answer and maxdepth to the current values.
     * 
     * After searching, we return lowestLeftVal
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      Where n is the number of nodes in the tree rooted at root
     * - Space complexity:
     *      O(1)
     *      As we do not store a variable amount of information
    */
    public static int maxDepth;
    public static int lowestLeftVal;

    public static int findBottomLeftValue(TreeNode root) {
        maxDepth = 0;
        lowestLeftVal = root.val;
        getLowestLeft(root, 0);
        return lowestLeftVal;
    }

    /**
     * This is a helper method that, given a treenode n, sets the values of maxDepth and lowestLeftVal
     * 
     * @param n
     *      The treenode of which we are traversing to get the height
     * @param depth
     *      The current depth which we have dived
     */
    public static void getLowestLeft(TreeNode n, int depth){
        if(n.left != null){
            getLowestLeft(n.left, depth+1);
        
        } 
        if(n.right != null){
            getLowestLeft(n.right, depth+1);
        }
        
        if(depth > maxDepth){
            maxDepth = depth;
            lowestLeftVal = n.val;
        }
    }

    public static void main(String args[]){
        TreeNode n = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,null,0,0,0,15}, 0);
        System.out.println(findBottomLeftValue(n));
    }
}
