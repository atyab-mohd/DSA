/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode help(int min, int max, TreeNode root){
        if(root == null) return null;
        if(root.val<min) return help(min, max, root.right);
        else if(root.val>max) return help(min, max, root.left);
        else return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int min = Math.min(p.val, q.val);
        int max = Math.max(p.val, q.val);
        return help(min, max, root);
    }
}