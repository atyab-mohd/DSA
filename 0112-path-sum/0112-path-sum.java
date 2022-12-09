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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root ==null) return false;
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();
        nodeStack.add(root);
        sumStack.add(targetSum - root.val);
        while(!nodeStack.empty()){
            TreeNode cur_node = nodeStack.pop();
            int cur_sum = sumStack.pop();
            if(cur_node.left == null && cur_node.right == null && cur_sum == 0) return true;
            if(cur_node.left != null){
                nodeStack.push(cur_node.left);
                sumStack.push(cur_sum - cur_node.left.val);
            }
            if(cur_node.right != null){
                nodeStack.push(cur_node.right);
                sumStack.push(cur_sum - cur_node.right.val);
            }
        }
        return false;
    }
}