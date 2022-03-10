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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list =new ArrayList<>();
        if(root==null) return list;
       
         Queue<TreeNode> parent=new ArrayDeque<>(); 
           parent.add(root);
              
        List<Integer> c1=new ArrayList<>();
        List<TreeNode> c2=new ArrayList<>();
        
        c1.add(root.val);
        list.add(c1);
        
        while(!parent.isEmpty()){
            TreeNode rem=parent.remove();
            
            if(rem.left!=null){
                c2.add(rem.left);
            }
            if(rem.right!=null){
                c2.add(rem.right);
            }
            
            if(parent.size()==0){
            c1=new ArrayList<>();
                for(TreeNode ch:c2){
                    c1.add(ch.val);
                    parent.add(ch);
                }
                if(c1.size()!=0)
                list.add(c1);
                c2=new ArrayList<>();
                
            }
            
        }
        
        return list;
    }
}