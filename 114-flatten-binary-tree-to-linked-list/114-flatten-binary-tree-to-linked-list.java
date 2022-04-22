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
    
    public void flatten(TreeNode root){
        flatten1(root);
    }
    
    public TreeNode flatten1(TreeNode root) {
    
        if(root==null) return null;
        
        TreeNode l=flatten1(root.left);
        
        TreeNode r=flatten1(root.right);
        
        if(l!=null)
        l.right=root.right;
        
        if(root.left!=null)
        root.right=root.left;
        
        // System.out.println(root.val);
        
        root.left=null;
        
        if(r!=null){
            // System.out.println("r : "+r.val);
            return r; }
        if(l!=null) return l;
        else{
            if(root.val==2){
                // System.out.println("ro : "+root.right.val);
            }
         // System.out.println(root.val);
            return root;
        }
    }
    
}