class Solution {
    public List<Integer> intersection(int[][] nums) {
        
        int[]a =new int[1001];
       
        int n=nums.length;
        
        List<Integer> ans=new ArrayList<>();
        for(int[] x:nums){
            for(int y:x){
                a[y]++;
            }
        }
        
        
        for(int i=1;i<1001;i++){
            
            if(a[i]==n){
                ans.add(i);
            }
        }
        Collections.sort(ans);   
        return ans;
    }
}