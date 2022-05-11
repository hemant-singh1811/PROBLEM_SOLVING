class Solution {
    public int findMin(int[] nums) {
        
         int ans=Integer.MAX_VALUE;
        
        for(int x:nums){
            ans=Math.min(x,ans);
        }
      return ans;
    }
}