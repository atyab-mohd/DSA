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
    ArrayList<Integer> sort = new ArrayList<>();
    void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        sort.add(root.val);
        inOrder(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        else if(root.left == null && root.right == null) return false;
        else{
            inOrder(root);
            int i = 0, j = sort.size()-1;
            while(i<j){
                int sum = sort.get(i) + sort.get(j);
                if(sum == k) return true;
                else if(sum > k) j--;
                else i++;
            }
        }
        return false;
    }
}