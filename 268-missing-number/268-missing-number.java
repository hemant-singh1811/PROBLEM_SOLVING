class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        
        long sum=n*(n+1)/2;
        
        long x=0;
        
        for(int y:nums){
        x+=y;
        }
        
        return  (int) (sum-x);
        
    }
}