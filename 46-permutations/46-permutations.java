class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        
        
        rec(nums,new ArrayList<>(),ans,new boolean[nums.length]);
        
        return ans;
    }
    
    public static void rec(int[] nums,ArrayList<Integer> a,List<List<Integer>> ans,boolean[] used){
        
        if(a.size()==nums.length){
            ans.add(new ArrayList<>(a));
            return ;
        }
        
        for(int i=0;i<nums.length;i++){
        
            if(used[i]) continue;
            
            a.add(nums[i]);
            used[i]=true;
            rec(nums,a,ans,used);
            used[i]=false;
            a.remove(a.size()-1);
        } 
    }
}