class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
       ans=new ArrayList<>();
        boolean visited[]=new boolean[nums.length]; 
        per(nums,visited, new ArrayList<>());
        return ans;
    }
    
    public static void per(int[] nums,boolean[] visited,ArrayList<Integer> arr)     {
       if(arr.size()==nums.length){ 
           ans.add(arr);
           return ;
       } 
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            int el=nums[i]; 
            ArrayList<Integer> subans=new ArrayList<>(arr);
             
            if(!visited[i]){ 
                visited[i]=true;
                subans.add(el);
                per(nums,visited,subans);
                visited[i]=false;                
            } 
        } 
    } 
}