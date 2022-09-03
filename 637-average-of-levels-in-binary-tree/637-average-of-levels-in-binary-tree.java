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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<Double> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int s=q.size();
            double sum=(double)0;
            for(int i=0;i<s;i++){
                TreeNode curr=q.poll();
                sum+=curr.val;
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right)  ;  
            }
            ans.add(sum/s);
        }
        return ans;
    }
}