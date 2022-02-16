class Solution { 
    static List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
          ans=new ArrayList<>();
        boolean visited[]=new boolean[21]; 
        per(nums,visited, new ArrayList<>());
        return ans;
    } 
  
    public static void per(int[] nums,boolean[] visited,ArrayList<Integer> arr)     {
       if(arr.size()==nums.length){ 
           ans.add(arr);
           return ;
       } 
        int n=nums.length;
        boolean[] visit=new boolean[21];
        for(int i=0;i<n;i++){
            int el=nums[i]; 
            int idx=el;
            ArrayList<Integer> subans=new ArrayList<>(arr);
            
            if(el<0){
                idx=10+(el*-1);
            }
            
            if(!visited[i] && !visit[idx]){ 
                visited[i]=true;
                subans.add(el);
                per(nums,visited,subans);   
                visited[i]=false;
                visit[idx]=true;
            } 
        } 
    } 
}