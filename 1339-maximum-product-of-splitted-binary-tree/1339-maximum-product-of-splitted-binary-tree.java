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
 
    long total;
    long max = 0;
    long mod = 1000000007;
 
    public int sum(TreeNode root) {
        if(root == null) return 0;
 
        int l = sum(root.left);
        int r = sum(root.right);
 
        root.val += (l + r);
 
        return root.val;
    }
 
    // this will update the max variable with the answer
    public void traverse(TreeNode root) {
        if(root == null) return;
 
        int curr = root.val;
        max = Math.max(max, curr * (total - curr));
 
        traverse(root.left);
        traverse(root.right);
    }
 
    public int maxProduct(TreeNode root) {
        this.total = sum(root);
 
        traverse(root);
        int ans = (int) (max % mod);
 
        return ans;
    }
}
