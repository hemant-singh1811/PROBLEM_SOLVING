class Solution {
    
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> a=new ArrayList<>();
        
        Arrays.sort(nums);
        rec(nums,a,new ArrayList<>(),new boolean[nums.length]);              
        
        return a;        
    }
    
    public static void rec(int[] nums,List<List<Integer>> ans,ArrayList<Integer> a,boolean[] used){
        
        if(a.size()==nums.length){
            ans.add(new ArrayList<>(a));            
            return ;
        } 
        
        for(int i=0;i<nums.length;i++){
             
            if(used[i] || i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            
            a.add(nums[i]);
            used[i]=true;
            rec(nums,ans,a,used);
            used[i]=false;
            a.remove(a.size()-1);
        }        
    }
}