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
    public List<Integer> rightSideView(TreeNode root) {
        // List<Integer> ans= new ArrayList<>();
        // rightView(root, ans, 0);
        // return ans;

        //2. Solving by Level Order Transversal
        List<Integer> ans= new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size= q.size();
            for(int i=0;i<size;i++){
                TreeNode cur= q.poll();
                if(i==0) ans.add(cur.val);
                if(cur.right != null) q.add(cur.right);
                if(cur.left != null) q.add(cur.left);
            }
        }
        return ans;
    }
    // void rightView(TreeNode root, List<Integer> ans, int level){
    //     if(root == null) return;
    //     if(level == ans.size()) ans.add(root.val); //add the value when the size of list equal to the level
    //     rightView(root.right, ans, level+1);
    //     rightView(root.left, ans, level+1);
    // }
}