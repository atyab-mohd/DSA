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
    int min = Integer.MAX_VALUE;
    void height(TreeNode root, int depth){
        if(root == null) return;
        if(root.left == null && root.right == null){
            min = Math.min(min, depth);
        }
        height(root.left, depth+1);
        height(root.right, depth+1);

    }
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        height(root, 1);
        return min;
    }
}