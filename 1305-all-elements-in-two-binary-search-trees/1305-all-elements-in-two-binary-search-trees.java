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
    static List<Integer> ans;
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ans=new ArrayList<>();
        
        print(root1);
        print(root2);
        
        Collections.sort(ans);
        
        return ans;
    }
    
    public static void print(TreeNode root){
        if(root==null) return ;
        
        ans.add(root.val);
        
        print(root.left);
        print(root.right);
        
    }
}