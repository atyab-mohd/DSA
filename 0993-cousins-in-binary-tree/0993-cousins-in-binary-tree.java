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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q =  new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            boolean xExist = false;
            boolean yExist = false;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode cur = q.poll();
                if(cur.val == x) xExist = true;
                if(cur.val == y) yExist = true;
                if(cur.left != null && cur.right != null){
                    if(cur.left.val == x && cur.right.val == y) return false;
                    if(cur.left.val == y && cur.right.val == x) return false;
                }
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right); 
            }
            if(xExist && yExist) return true;
        }
        return false;
    }
}