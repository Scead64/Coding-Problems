package DiameterOfBinaryTree;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import HELPER_CLASSES.TreeNode;

public class Tester {

    
    /*
     * Tests for Diameter of Binary Tree
     */
    @Test
    void singleNodeTree() {
        TreeNode root = new TreeNode(1);
        int expectedsolution = 0;
        assertEquals(expectedsolution, Solution.diameterOfBinaryTree(root));
    }

    @Test
    void singlePathTree() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,1,null,1,null,null,null,1,null,null,null,null,null,null,null,1}, 0);
        int expectedsolution = 4;
        assertEquals(expectedsolution, Solution.diameterOfBinaryTree(root));
    }

    @Test
    void TwoPathTree() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,1,1,1,null,null,1,1,null,null,null,null,null,null,1,1}, 0);
        int expectedsolution = 7;
        assertEquals(expectedsolution, Solution.diameterOfBinaryTree(root));
    }

    @Test
    void TwoBranchPathTree() {
        TreeNode root = TreeNode.constructTree(new Integer[]{1,1,null,1,1,null,null,1,null,1,null,null,null,null,null,1,null,1,null}, 0);
        int expectedsolution = 5;
        assertEquals(expectedsolution, Solution.diameterOfBinaryTree(root));
    }
}
