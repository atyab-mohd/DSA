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
    int sum(TreeNode root, int prev){
        if(root == null) return 0;
        int curr = prev*10 + root.val;
        if(root.left == null && root.right == null) return curr;
        int leftpath = sum(root.left, curr);
        int rightpath = sum(root.right, curr);
        return leftpath + rightpath;
    }
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }
}