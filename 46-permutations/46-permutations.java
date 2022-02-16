class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
       ans=new ArrayList<>();
        boolean visited[]=new boolean[21]; 
        per(nums,visited, new ArrayList<>());
        return ans;
    }
    
    public static void per(int[] nums,boolean[] visited,ArrayList<Integer> arr)     {
       if(arr.size()==nums.length){
           // System.out.println("this is");
           ans.add(arr);
           return ;
       } 
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            int el=nums[i];
            int idx=el;
            ArrayList<Integer> subans=new ArrayList<>(arr);
            
            if(el<0){
             // el=el*-1;
                idx=10+el*-1;
            }
            if(!visited[idx]){ 
                visited[idx]=true;
                subans.add(el);
                per(nums,visited,subans);
                visited[idx]=false;                
            } 
        } 
    } 
}