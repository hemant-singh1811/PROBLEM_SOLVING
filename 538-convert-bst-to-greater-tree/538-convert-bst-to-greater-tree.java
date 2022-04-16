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
    public TreeNode convertBST(TreeNode root) {
        
        
        if(root==null) return root;
        
        con(root,0);
        return root;
    }
    
    public int con(TreeNode root,int ans){
        
        if(root==null){
            return ans;
        }
        
        ans=con(root.right,ans);
        
        root.val+=ans;
        
        ans=con(root.left,root.val);
        
        return ans;
        
    }
    
}