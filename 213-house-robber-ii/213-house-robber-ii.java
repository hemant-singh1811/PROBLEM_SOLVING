class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }
        int maxItem = nums.length-1;
        int[] dp = new int[nums.length+3];
        for (int i=maxItem-1; i >= 0 ;i--) {
            dp[i] = nums[i] + Math.max(dp[i+2],dp[i+3]);
        }
        for (int i=maxItem; i > 0 ;i--) {
            dp[i] = nums[i] + Math.max(dp[i+2],dp[i+3]);
        }
        return Math.max(dp[0],Math.max(dp[1],dp[2]));
    }
}