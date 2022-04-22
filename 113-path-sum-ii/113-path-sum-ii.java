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
 
    static List<List<Integer>> alllist;
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       
        alllist=new ArrayList<>();
        path(root,targetSum,new ArrayList<>());
        return alllist;
    
    }
    
    public void path(TreeNode root,int sum,List<Integer> ans1){
        
        List<Integer> ans=new ArrayList<>(ans1);
        
        
        // if(sum<0) return ;
    
        if(root==null)return;
        
        ans.add(root.val);
        sum-=root.val;
        
        if(sum==0 && root.left==null && root.right==null){
            alllist.add(ans);
            return ;
        }
                if(root.left!=null)
        path(root.left,sum,ans);
      
        if(root.right!=null)
        path(root.right,sum,ans);
    
    }
    
}