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
class Solution {int res=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
         int k=d(root);
        return res-1;
    }
                public int d(TreeNode root) {
        if(root==null)return 0;
        // if(root.left==null&&root.right==null)return 0;            
        int l=d(root.left);
        int r=d(root.right);
                    // int t=Math.max(l,r)+1;
                    // int a=Math.max(t,l+r);
        res=Math.max(res,l+r+1);
        
        return Math.max(l,r)+1;
    }
}