package EvenOddTree;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import HELPER_CLASSES.TreeNode;

public class Tester {

    
    /*
     * Tests for Even Odd Tree
     */
    @Test
    void singleNodeTreeTrue() {
        TreeNode root = new TreeNode(1);
        assertTrue(Solution.isEvenOddTree(root));
    }

    @Test
    void singleNodeTreeFalse() {
        TreeNode root = new TreeNode(0);
        assertFalse(Solution.isEvenOddTree(root));
    }

    @Test
    void multiNodeTreeTrue() {
        int[] tree = {1,4,2,3,5,7,9};
        TreeNode root = TreeNode.constructTree(tree, 0);
        assertTrue(Solution.isEvenOddTree(root));
    }

    @Test
    void multiNodeTreeFalseWrongEvenLevelParity() {
        int[] tree = {1,4,2,3,5,7,8};
        TreeNode root = TreeNode.constructTree(tree, 0);
        assertFalse(Solution.isEvenOddTree(root));
    }

    @Test
    void multiNodeTreeFalseWrongOddLevelParity() {
        int[] tree = {1,4,1,3,5,7,9};
        TreeNode root = TreeNode.constructTree(tree, 0);
        assertFalse(Solution.isEvenOddTree(root));
    }

    @Test
    void multiNodeTreeFalseEvenDecrease() {
        int[] tree = {1,4,2,3,5,7,3};
        TreeNode root = TreeNode.constructTree(tree, 0);
        assertFalse(Solution.isEvenOddTree(root));
    }

    @Test
    void multiNodeTreeFalseOddIncrease() {
        int[] tree = {1,4,6,3,5,7,9};
        TreeNode root = TreeNode.constructTree(tree, 0);
        assertFalse(Solution.isEvenOddTree(root));
    }
}
