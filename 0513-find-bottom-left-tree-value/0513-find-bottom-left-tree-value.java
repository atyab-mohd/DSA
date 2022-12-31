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
    public int findBottomLeftValue(TreeNode root) {
        if(root == null) return -1;
        // if(root.left == null && root.right == null) return root.val;
        // return findBottomLeftValue(root.left);
        int left_most = -1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            //ArrayList<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                //level.add(curr.val);
                if(i == 0) left_most = curr.val;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            //left_most = level.get(0);
        }
        return left_most;
    }
}