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
    TreeNode construct(int[] preorder, int[]inorder, int pstart, int pend, int istart, int iend){
        if(pstart > pend || istart > iend) return null;
        int idx= istart;
        while(preorder[pstart] != inorder[idx]) idx++;
        int cnt= idx - istart;
        TreeNode root = new TreeNode(preorder[pstart]);
        root.left = construct(preorder, inorder, pstart + 1, pstart + cnt, istart, idx -1);
        root.right = construct(preorder, inorder, pstart + cnt + 1, pend, idx + 1, iend);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
    }
}