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
    static int t=0;
    static int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        t=0;
        ans=0;
        
        inorder(root,k);
        
        return ans;
    }
    
    public static void inorder(TreeNode root,int k){
        
        if(root==null){
            return ;
        }        
        
        inorder(root.left,k);
        
        t++;
        if(t==k){
            ans=root.val;
        }
        
        inorder(root.right,k);
        
        
    }
}