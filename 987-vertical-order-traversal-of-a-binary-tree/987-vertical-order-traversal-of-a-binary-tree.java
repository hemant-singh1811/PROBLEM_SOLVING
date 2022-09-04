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

class vertical implements Comparable<vertical>{
    int root;
    int fac;
    int level=0;
    public int compareTo(vertical v){
        if(v.fac==this.fac){
            if(this.level==v.level) return this.root-v.root;
            return this.level-v.level;
        }
        
        return v.fac-this.fac; //max
    }
}
class Solution { 
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        if(root==null) return new ArrayList<>();
        
        List<vertical> list=traverse(root,0,0);
        
        List<List<Integer>> ans=new ArrayList<>();
        
        Collections.sort(list);
        List<Integer> subans=new ArrayList<>();
        
        int prev=Integer.MAX_VALUE; 
        for(vertical v:list){ 
            if(prev==Integer.MAX_VALUE || prev==v.fac)
            {
                prev=v.fac;
                subans.add(v.root);
            }else{
                // Collections.sort(subans);
                ans.add(new ArrayList<>(subans));
                subans=new ArrayList<>();
                prev=v.fac;
                subans.add(v.root);
            }
            
        }
        
                // Collections.sort(subans);
                ans.add(new ArrayList<>(subans));
        
        return ans;
        
    }
    
    public static List<vertical> traverse(TreeNode root,int fac,int level){
        List<vertical> ans=new ArrayList<>();
        
        if(root.left!=null){
          ans.addAll(traverse(root.left,fac+1,level+1));
        }
        
        if(root.right!=null){
           ans.addAll(traverse(root.right,fac-1,level+1));
        }
        
        vertical v=new vertical();
        v.root=root.val;
        v.fac=fac;
        v.level=level;
        ans.add(v);
        
        return ans;
    }
}