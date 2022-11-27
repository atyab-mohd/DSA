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
class Solution {
    //InOrder of BST will give us sorted array 
    ArrayList<Integer> arr = new ArrayList<>();
    void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        arr.add(root.val);
        inOrder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        return arr.get(k-1); //just returning 
    }
}