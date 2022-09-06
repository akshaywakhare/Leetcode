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
    public TreeNode pruneTree(TreeNode root) {
        if(!helper(root))return null;
        return root;
    }
    public boolean helper(TreeNode r){
        if(r==null)return false;
        boolean lflag=helper(r.left);
          boolean rflag=helper(r.right);
        if(!lflag)r.left=null;
        if(!rflag)r.right=null;
        // rflag=||rflag;
        return  (r.val==1)||rflag||lflag;
    }
}