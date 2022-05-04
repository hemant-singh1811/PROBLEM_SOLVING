class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int i=1;
        int j=nums.length;
        int ans=0;
        
        while(i<=j){
            int mid=(i+j)/2; 
            if(maxwidsum(mid,nums)>=target){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
    public static int maxwidsum(int k,int[] nums){
        int sum=0;
        int maxsum=0;
        int n=nums.length;
        for(int i=0;i<k;i++) sum+=nums[i];
        maxsum=sum;
        for(int i=1;i<n-k+1;i++){
            
            sum-=nums[i-1];
            sum+=nums[i+k-1];
            maxsum=Math.max(maxsum,sum);            
        }
        // if(k==5) System.out.println(maxsum);
        return maxsum;
    }
}