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
    boolean sameTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        // checking symmetry root left should be equal to root right nd vice versa
        boolean left= sameTree(p.left, q.right); 
        boolean right= sameTree(p.right, q.left);
        return left && right && (p.val == q.val);
    }
    public boolean isSymmetric(TreeNode root) {
        return sameTree(root, root);
    }
}