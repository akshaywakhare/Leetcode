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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> ans=new  ArrayList<List<Integer>>();
    
        Deque<TreeNode> q=new LinkedList<>();
        TreeNode end=new TreeNode(-1);
        q.add(root);
        q.addLast(end);
        boolean direction=true;
        ArrayList<Integer>level=new ArrayList<>();
        while(q.size()!=1){
            if((q.peekFirst()==end&&direction)||(q.peekLast()==end&&!direction)){direction=(direction^true);
                                                                                ans.add(level);
                                                                                level=new ArrayList<>();}
       
            
            TreeNode current;
            
            if(direction) {
            current=q.pollFirst();
                if(current==null)continue;
                                level.add(current.val);

                if(current.left!=null)q.addLast(current.left);
                if(current.right!=null)q.addLast(current.right);

            }else{
                current=q.pollLast();
                
                if(current==null)continue;
                level.add(current.val);
                if(current.right!=null)q.offerFirst(current.right);
                if(current.left!=null)q.offerFirst(current.left);
            }
        }   
        if(level.size()!=0)ans.add(level);
        return ans;
    }
}