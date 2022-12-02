
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key){
            //1. if the deleting node has 0 child
            if(root.left == null && root.right == null) return null;
            //2. only 1 child i.e at the left
            if(root.left != null && root.right == null) return root.left;
            //3. only 1 child i.e at the right
            if(root.left == null && root.right != null) return root.right;
            //4. 2 child
            int leftSubtreeMax = bringMax(root.left); //we can also bring the min of right subtree
            root.val= leftSubtreeMax;
            root.left= deleteNode(root.left, leftSubtreeMax);
        }
        else if(root.val > key) root.left= deleteNode(root.left, key);
        else root.right= deleteNode(root.right, key);
        return root;
    }
    int bringMax(TreeNode root){
        TreeNode temp= root;
        while(temp.right != null){
            temp= temp.right;
        }
        return temp.val;
    }
}