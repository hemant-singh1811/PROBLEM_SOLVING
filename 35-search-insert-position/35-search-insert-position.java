class Solution {
    public int searchInsert(int[] nums, int target) {
        
        
        int i=0;
        int j=nums.length-1;
        int ans=-1;
        
        while(i<=j){
            
            int mid=(i+j)/2;
            
            if(target==nums[mid]) return mid;
            
            if(target>nums[mid]) {
                i=mid+1;
                // ans=mid;
            }
                else {
                    // h=1;
                    j=mid-1;
                    ans=mid;
                 }
        }
        if(ans==-1){
            return nums.length;
        }
        return ans;
    }
}