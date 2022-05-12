class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
     int i=1;
     int j=nums.length;
     int ans=0;
        
        while(i<=j){
            int mid=(i+j)/2;
            
            if(lensum(nums,mid)>=target){
                ans=mid;
                j=mid-1;
            }else
                i=mid+1;
        }
        return ans;
    }
    
    public static int lensum(int[] nums,int len){
        int sum=0;
        int maxsum=0;
        
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        maxsum=sum;
        
        for(int i=1;i<nums.length-len+1;i++){
            
            sum-=nums[i-1];
            sum+=nums[i+len-1];            
            
            maxsum=Math.max(maxsum,sum);
        }
       return maxsum;
    }
}