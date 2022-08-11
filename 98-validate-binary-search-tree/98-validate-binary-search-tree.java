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
    List<Integer> in;boolean flag;
    public boolean isValidBST(TreeNode root) {
        in=new ArrayList<>();
        flag=true;
        fill(root);
        if(!flag)return false;
        List<Integer> sorted=new ArrayList<>(in);
        Collections.sort(sorted);
        for(int i=0;i<in.size();i++){
            // System.out.println(in.get(i));
            if(in.get(i)!=sorted.get(i))return false;
        }
        return true;
        
    }
    void fill(TreeNode r){
        if(r==null)return;
        fill(r.left);
        if(in.contains(r.val))flag=false;
        in.add(r.val);
        fill(r.right);
    }
}