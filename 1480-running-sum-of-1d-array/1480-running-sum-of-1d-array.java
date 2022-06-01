class Solution {
    public int[] runningSum(int[] nums) {
        
        int n=nums.length;
        
        int[] a=new int[n];
        
        int sum=0;
        
        int i=0;
        for(int x:nums)
        {
            sum+=x;
            a[i]=sum;
            i++;
        }
        return a;
        
    }
}