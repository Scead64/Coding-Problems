package SameTree;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import HELPER_CLASSES.TreeNode;

public class Tester {

    
    /*
     * Tests for Same Tree
     */
    @Test
    void singleNodeTreeTrue() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        assertTrue(Solution.isSameTree(p, q));
    }

    @Test
    void singleNodeTreeFalse() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(10);
        assertFalse(Solution.isSameTree(p, q));
    }

    @Test
    void multiNodeTreeTrue() {
        TreeNode p = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 0);
        TreeNode q = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 0);
        assertTrue(Solution.isSameTree(p, q));
    }

    @Test
    void multiNodeTreeFalse() {
        TreeNode p = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 0);
        TreeNode q = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,null}, 0);
        assertFalse(Solution.isSameTree(p, q));
    }
}
