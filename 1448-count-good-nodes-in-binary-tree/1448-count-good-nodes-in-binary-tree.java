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
    public int goodNodes(TreeNode root) {
        return goodnodes(root,Integer.MIN_VALUE);
    }
    
    public int goodnodes(TreeNode root,int max){

         if(root==null) return 0;
        int ans=0;
        
        if(root.val>=max){
            ans++;
        }
        
        max=Integer.max(max,root.val);
        
        ans+=goodnodes(root.left,max);
        
        ans+=goodnodes(root.right,max);
                
        return ans;

    }
}