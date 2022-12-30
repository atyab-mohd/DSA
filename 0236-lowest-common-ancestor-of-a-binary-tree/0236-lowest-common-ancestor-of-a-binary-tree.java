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
    boolean search(TreeNode root, TreeNode key, ArrayList<TreeNode> path){
        if(root == null) return false;
        if(root == key){
            path.add(root);
            return true;
        }
        boolean res= search(root.left, key, path) || search(root.right, key, path);
        if(res == true) path.add(root);
        return res; 
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> pathP= new ArrayList<>();
        search(root, p, pathP);
        ArrayList<TreeNode> pathQ= new ArrayList<>();
        search(root, q, pathQ);
        int i= pathP.size()-1;
        int j= pathQ.size()-1;
        TreeNode ans= null;
        while(i >=0 && j>=0){
            if(pathP.get(i) == pathQ.get(j)) ans= pathP.get(i);
            else break;
            i--;
            j--;
        }
        return ans;
    }
}