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
    static int currdeep=0;
    static int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        currdeep=0;
        sum=0;
        deep(root,0);
        return sum;
    }

    public static void deep(TreeNode root,int deep){
        
        if(root==null) return ;
         
        if(root.left==null && root.right==null){
            if(deep>currdeep){
                currdeep=deep;
                sum=root.val;
            }else if(deep==currdeep){
                sum+=root.val;
            }
          return ;
        }
        
        deep(root.left,deep+1);
        deep(root.right,deep+1);
        
        
    }
}