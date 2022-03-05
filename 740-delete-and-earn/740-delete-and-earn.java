class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[10001];
        for (int i : nums) sum[i] += i;
        
        for (int i = 2; i < 10001; ++i) {
            sum[i] = Math.max(sum[i-1], sum[i-2] + sum[i]);
        }

        return sum[10000];
    }
}