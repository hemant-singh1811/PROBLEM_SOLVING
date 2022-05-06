class Solution {
 public int jump(int[] nums) {
        if (nums.length == 1) return 0;

        int hi = 0 + nums[0];
        if ( hi >= nums.length-1) return 1;

        int lastLevel = 1;
        int nextHi = hi;
        int i = 1;

        while (i < nums.length) {
            while (i <= hi) {
                nextHi = Math.max(nextHi, i + nums[i]);
                if (nextHi >= nums.length-1) return lastLevel+1;
                i++;
            }
            hi = nextHi;
            lastLevel++;;
        }
        return 0;

    }}