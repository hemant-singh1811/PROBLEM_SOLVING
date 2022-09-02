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
    public List<Double> averageOfLevels(TreeNode root) {
     
        ArrayList<Double> ans=new ArrayList<>();
    
        Queue<TreeNode> parent=new ArrayDeque<>();
        
        parent.add(root);
        
        while(!parent.isEmpty()){
            
            int size=parent.size();
            
            long sans=0;
            for(int i=0;i<size;i++){
            TreeNode rem=parent.remove();
                
                 
                sans+=rem.val;
                
                if(rem.left!=null)
                parent.add(rem.left);
                if(rem.right!=null)
                parent.add(rem.right);
                
            }
            double ans1=((double) sans)/((double) size);
            
            ans.add(ans1);
        }
        
        return ans;
        
    }
    
    
}