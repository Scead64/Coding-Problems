package HELPER_CLASSES;


public class TreeNode{
    public int val;  
    public TreeNode left;
    public TreeNode right;
  
    public TreeNode() {  
    }

    public TreeNode(int val) {  
        this.val = val;  
    }

    public TreeNode(int _val, TreeNode left, TreeNode right) {  
        this.val = _val;
        this.left = left;
        this.right = right;
    }

    /** 
     * This method is for testing purposes and is not meant to be used in solutions.
     * Constructs tree in order of values provided. A 0 designates a null value.
     * 
     * NOTE: behavior is undefined for invalid tree.
     *       possible invalid trees include null root (0 given),
     *       or "ghost pathways", where a value is given in a path containing a null node 
     * @param
     *      tree[], the integer array from which the tree will be constructed
     * 
     * @requires
     *      1 <= tree.length < 2^31
     * 
     * @returns
     *      The root treenode of the tree constructable from 
     * 
    */ 
    public static TreeNode constructTree(int[] tree, int index){
        TreeNode root = new TreeNode(tree[index]), left, right;
        int leftIndex = index*2+1, rightIndex = leftIndex+1;
        if(leftIndex < tree.length && tree[leftIndex] != 0){
            left = constructTree(tree, leftIndex);
            root.left = left;
        }
        if(rightIndex < tree.length && tree[rightIndex] != 0){
            right = constructTree(tree, rightIndex);
            root.right = right;
        }
        return root;
    }
}