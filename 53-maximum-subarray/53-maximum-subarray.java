class Solution {
    public int maxSubArray(int[] nums) {
 
        int maxsum=Integer.MIN_VALUE;
        int max=0;
        
        for(int x:nums){
            
            if(max+x>x){
                max+=x;
            }else{
                max=x;
            }
            maxsum=Integer.max(maxsum,max);
            
        }
        
        return maxsum;
        
    }
}