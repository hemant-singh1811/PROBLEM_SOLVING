class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int l=1;
        int h=nums.length;
        int ans=0;
        while(l<=h){
            int mid=(h+l)/2;
        
        boolean ans1=maxone(nums,mid);
            
            if(ans1){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        
        return ans;
    }
    
    public static boolean maxone(int[] nums,int mid){
        
        int n=nums.length;
        int sum=0;
        
        for(int i=0;i<mid;i++) sum+=nums[i];
        
        if(sum==mid)return true;
        
        for(int i=1;i<=n-mid;i++){
            sum-=nums[i-1];
            
            sum+=nums[i+mid-1];
            
            if(sum==mid)return true;
        
        }
        return false;
    }
}