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
  public TreeNode bstToGst(TreeNode root) {
       
        bstToGst(root,0);
        return root;

    }
    
    public int bstToGst(TreeNode root,int val) {
        
        if(root==null) return val;
        
        val=bstToGst(root.right,val);
        
        val+=root.val;
        root.val=val;
        
         val=bstToGst(root.left,val);
        
        return val;
    }  
}
