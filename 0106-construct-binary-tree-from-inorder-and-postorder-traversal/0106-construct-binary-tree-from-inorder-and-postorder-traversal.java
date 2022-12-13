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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<inorder.length;i++) hm.put(inorder[i], i);
        return buildInPosTree(inorder, postorder, 0, inorder.length - 1, 0, postorder.length-1, hm);
    }
    TreeNode buildInPosTree(int []in, int []pos, int inS, int inE, int posS, int posE, HashMap<Integer, Integer> hm){
        if(inS > inE || posS > posE) return null;
        TreeNode root = new TreeNode(pos[posE]);
        int Root = hm.get(pos[posE]);
        int nodes = Root - inS;
        root.left = buildInPosTree(in , pos, inS, Root-1, posS, posS + nodes -1, hm);
        root.right = buildInPosTree(in, pos, Root+1, inE, posS+nodes, posE-1, hm);
        return root;
    }
}