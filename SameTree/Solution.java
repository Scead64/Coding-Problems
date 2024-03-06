package SameTree;

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

    /*
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      Where n is the minimum number of nodes between the trees rooted at p and q
     * - Space complexity:
     *      O(1)
     *      As we do not store a variable amount of information
    */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        } else if (p != null && q != null){
            if(p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        TreeNode p = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,null,null,null,null,15}, 0);
        TreeNode q = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,null,null,null,null,15}, 0);
        System.out.println(isSameTree(p, q));
    }
}
