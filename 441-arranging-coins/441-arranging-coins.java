class Solution {
    public int arrangeCoins(int n) {
        
        long i=1;
        long j=n;
        
        long ans=0;
        
        while(i<=j){
            long mid=(i+j)/2;
            
            if((mid*(mid+1))/2 <=n){
                ans=mid;
                i=mid+1;
            }else j=mid-1;
            
        }
        return (int)ans;
    }
}