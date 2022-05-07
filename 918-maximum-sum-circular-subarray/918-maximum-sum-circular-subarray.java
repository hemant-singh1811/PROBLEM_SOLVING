class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int curr_max=0;
        int curr_min=0;
        
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            curr_max=Math.max(curr_max+nums[i],nums[i]);
            max=Math.max(curr_max,max);
            curr_min=Math.min(curr_min+nums[i],nums[i]);
            min=Math.min(curr_min,min);
        }
        
        if(max>0){
            return Math.max(max,total-min);
        }
        
        return max;
        
        
    }
}
