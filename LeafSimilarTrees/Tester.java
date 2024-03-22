package LeafSimilarTrees;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import HELPER_CLASSES.TreeNode;

public class Tester {

    
    /*
     * Tests for Find Bottom Left Tree Value
     */
    @Test
    void singleNodeTree() {
        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(1);
        assertTrue(Solution.leafSimilar(root, root2));
    }

    @Test
    void singlePathLeftTree() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,2,null,4,null,null,null,8,null,null,null,null,null,null,null,16}, 0);
        TreeNode root2 = TreeNode.constructTree(new Integer[]{1,2,null,4,null,null,null,8,null,null,null,null,null,null,null,16}, 0);
        assertTrue(Solution.leafSimilar(root, root2));
    }

    @Test
    void singlePathLeftDifferentTreesTrue() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,2,null,4,null,null,null,8,null,null,null,null,null,null,null,16}, 0);
        TreeNode root2 = TreeNode.constructTree(new Integer[]{1,2,null,4,null,null,null,16}, 0);
        assertTrue(Solution.leafSimilar(root, root2));
    }

    @Test
    void singlePathLeftDifferentTreesFalse() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,2,null,4,null,null,null,8,null,null,null,null,null,null,null,16}, 0);
        TreeNode root2 = TreeNode.constructTree(new Integer[]{1,2,null,4,null,null,null,7}, 0);
        assertFalse(Solution.leafSimilar(root, root2));
    }

    @Test
    void singlePathRightTree() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,null,3,null,null,null,7,null,null,null,null,null,null,null,15}, 0);
        TreeNode root2 = TreeNode.constructTree(new Integer[]{1,null,3,null,null,null,7,null,null,null,null,null,null,null,15}, 0);
        assertTrue(Solution.leafSimilar(root, root2));
    }

    @Test
    void singlePathRightDifferentTreesTrue() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,null,3,null,null,null,7,null,null,null,null,null,null,null,15}, 0);
        TreeNode root2 = TreeNode.constructTree(new Integer[]{1,null,3,null,null,null,15}, 0);
        assertTrue(Solution.leafSimilar(root, root2));
    }

    @Test
    void singlePathRightDifferentTreesFalse() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,null,3,null,null,null,7,null,null,null,null,null,null,null,15}, 0);
        TreeNode root2 = TreeNode.constructTree(new Integer[]{1,null,4}, 0);
        assertFalse(Solution.leafSimilar(root, root2));
    }

    @Test
    void balancedTreeTrue() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 0);
        TreeNode root2 = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 0);
        assertTrue(Solution.leafSimilar(root, root2));
    }

    @Test
    void balancedTreeDifferentBranchesTrue() {
        TreeNode root = TreeNode.constructTree(new Integer[]{10,20,30,40,50,60,70,8,9,10,11,12,13,14,15}, 0);
        TreeNode root2 = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 0);
        assertTrue(Solution.leafSimilar(root, root2));
    }

    @Test
    void balancedTreeDifferentBranchesFalse() {
        TreeNode root = TreeNode.constructTree(new Integer[]{10,20,30,40,50,60,70,8,9,10,11,12,13,14,15}, 0);
        TreeNode root2 = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,18}, 0);
        assertFalse(Solution.leafSimilar(root, root2));
    }
}
