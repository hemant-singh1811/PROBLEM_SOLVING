class Solution {
    public int smallestDivisor(int[] nums, int t) {
 
        int n=nums.length;
        
        int l=1; 
        int h=Integer.MIN_VALUE;
        
        for(int x:nums) h=Math.max(h,x);
        
        int ans =0;
        while(l<=h){
            int mid=(l+h)/2;
            
            if(div(mid,nums)<=t){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        
        return ans;
    }
    public int div(int d,int[] pos){
        int sum=0;
        
        for(int x:pos){
            if(x<=d) sum++;
            else{
                sum+=Math.ceil((double)x/(double)d);
            }
        }        
        return sum;
    }
}