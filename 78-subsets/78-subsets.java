class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        
        ans=new ArrayList<>();
        
        subsets(0,nums,new ArrayList<>());
        
        return ans;
    }
    
    public static void subsets(int idx,int[] nums,List<Integer> l){
        
            if(idx==nums.length){
                
                ans.add(new ArrayList<>(l));
                return ;
                
                };
        
        List<Integer> ans1=new ArrayList<>(l);
        subsets(idx+1,nums,ans1);
        ans1.add(nums[idx]);
        subsets(idx+1,nums,ans1);
        
    }
}