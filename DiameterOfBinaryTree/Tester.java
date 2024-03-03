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
        TreeNode root = TreeNode.constructTree(new int[]{1,1,0,1,0,0,0,1,0,0,0,0,0,0,0,1}, 0);
        int expectedsolution = 4;
        assertEquals(expectedsolution, Solution.diameterOfBinaryTree(root));
    }

    @Test
    void TwoPathTree() {
        TreeNode root = TreeNode.constructTree(new int[]{1,1,1,1,0,0,1,1,0,0,0,0,0,0,1,1}, 0);
        int expectedsolution = 7;
        assertEquals(expectedsolution, Solution.diameterOfBinaryTree(root));
    }

    @Test
    void TwoBranchPathTree() {
        TreeNode root = TreeNode.constructTree(new int[]{1,1,0,1,1,0,0,1,0,1,0,0,0,0,0,1,0,1,0}, 0);
        int expectedsolution = 5;
        assertEquals(expectedsolution, Solution.diameterOfBinaryTree(root));
    }
}
