package FindBottomLeftTreeValue;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import HELPER_CLASSES.TreeNode;

public class Tester {

    
    /*
     * Tests for Find Bottom Left Tree Value
     */
    @Test
    void singleNodeTree() {
        TreeNode root = new TreeNode(1);
        int expectedsolution = 1;
        assertEquals(expectedsolution, Solution.findBottomLeftValue(root));
    }

    @Test
    void singlePathLeftTree() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,2,null,4,null,null,null,8,null,null,null,null,null,null,null,16}, 0);
        int expectedsolution = 16;
        assertEquals(expectedsolution, Solution.findBottomLeftValue(root));
    }

    @Test
    void singlePathRightTree() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,null,3,null,null,null,7,null,null,null,null,null,null,null,15}, 0);
        int expectedsolution = 15;
        assertEquals(expectedsolution, Solution.findBottomLeftValue(root));
    }

    @Test
    void balancedTree() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 0);
        int expectedsolution = 8;
        assertEquals(expectedsolution, Solution.findBottomLeftValue(root));
    }

    @Test
    void balancedTreeAdditionalLeft() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}, 0);
        int expectedsolution = 16;
        assertEquals(expectedsolution, Solution.findBottomLeftValue(root));
    }

    @Test
    void balancedTreeAdditionalRight() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,31}, 0);
        int expectedsolution = 31;
        assertEquals(expectedsolution, Solution.findBottomLeftValue(root));
    }
}
