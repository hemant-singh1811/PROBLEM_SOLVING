class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target || nums[l] == target || nums[r] == target) {
                return true;
            } else if (nums[m] < nums[r]) {
                r = m - 1;
            } else if (nums[m] > nums[r]){
                l = m + 1;
            } else {
                // make sure it's not skipping potential pivot if mid equals right 
				// e.g. [1,1,1,1,2,1]
                r--;
            }
        }
        int n = nums.length;
        // sorted range i from [l, l + 1, ... l + n - 1], 
		// which i % n is the real index in nums
		// l = l, r = l + n - 1
        r = l + nums.length - 1;
        while(l <= r) {
            if(l >= r) return nums[l % n] == target;
            int m = l + (r - l) / 2;
            int mModed = m % n;
            if (nums[mModed] == target) {
                return true;
            } else if(nums[mModed] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
}