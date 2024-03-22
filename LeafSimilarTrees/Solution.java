package LeafSimilarTrees;

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
     * To compare leaves of trees, we first need to get the leaves in order.
     * We can accomplish this be iterating through the tree with an arraylist, and parsing depth-first from left to right.
     * Whenever we encounter a node with no children, we have encountered a leaf, and we can add that value to our arraylist.
     * We do this for both trees with two separate arraylists, then check to ensure the lists are the same.
     * 
     * Complexity
     * - Time complexity:
     *      O(n + m)
     *      Where n and m are the number of nodes in the trees rooted at root1 and root2 respectively.
     * - Space complexity:
     *      O((n+m)/2)
     *      As store al the leaves of both trees, and for a given balanced tree, the number of leaves is approximately equal to the number of nodes / 2.
    */
    public static int maxDepth;
    public static int lowestLeftVal;

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leaves1 = new ArrayList<Integer>(), leaves2 = new ArrayList<Integer>();
        getLeaves(leaves1, root1);
        getLeaves(leaves2, root2);
        if(leaves1.size() != leaves2.size()){
            return false;
        }
        
        for(int i = 0; i < leaves1.size(); i++){
            if(leaves1.get(i).intValue() != leaves2.get(i).intValue()){
                return false;
            }
        }
        return true;
    }

    public static void getLeaves(ArrayList<Integer> leaves, TreeNode n){
        if(n.left != null){
            getLeaves(leaves, n.left);
        }

        if(n.right != null){
            getLeaves(leaves, n.right);
        }

        if(n.right == null && n.left == null){
            leaves.add(n.val);
        }
    }

    public static void main(String args[]){
        TreeNode n = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7}, 0);
        TreeNode m = TreeNode.constructTree(new Integer[]{121,56,7,64,57,null,null,4,5,6}, 0);
        System.out.println(leafSimilar(n, m));
    }
}
