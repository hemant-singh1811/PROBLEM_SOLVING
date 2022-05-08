
class Solution {
    public int getMaxLen(int[] nums) {
        int n = nums.length;
        
        int curPositiveLen = nums[0] > 0 ? 1 : 0;
        int curNegativeLen = nums[0] < 0 ? 1 : 0;
        
        int maxPositiveLen = curPositiveLen; // what we'll return
        
        for (int i = 1; i < n; ++i) {
            
            int curVal = nums[i];
            
            // case: curVal is negative
            if (curVal < 0) {
                
                // subcase: at least one negative and zero or more positives in the subarray so far, and now
                //      this negative `curVal`, so we have both positive and negative subarrays in progress.
                if (curNegativeLen > 0) {
                    // swap `curNegativeLen + 1` and `curPositiveLen + 1`
                    int temp = curNegativeLen + 1;
                    curNegativeLen = curPositiveLen + 1;
                    curPositiveLen = temp;
                
                // subcase: all positives so far in the current subarray and now this negative `curVal`.
                // so we have a negative subarray now, and no positive subarray anymore.
                } else { // curNegativeLen == 0
                    curNegativeLen = curPositiveLen + 1;
                    curPositiveLen = 0;
                }
            }       
            
            // case: curVal is positive
            else if (curVal > 0) {
                ++curPositiveLen;  // the positive subarray gets longer
                if (curNegativeLen > 0) { // an existing negative subarray also gets longer with a positive `curVal`
                    ++curNegativeLen;
                }
            }
            
            // case: curVal is zero
            else {
                // reset both positive and negative subarrays
                curPositiveLen = 0;
                curNegativeLen = 0;
            }
            
            // update our best result so far
            maxPositiveLen = Math.max(maxPositiveLen, curPositiveLen);
        }
        
        return maxPositiveLen;
    }
}