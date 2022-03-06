class Solution {
    public int countOrders(int n) {
        
        if(n==0) return 0;
        long ans=1;
        
        int mod=1000000007;
        
        for(int i=1;i<=n;i++){
            
            ans=ans*i;
            
            ans=ans%mod;
            
            ans=ans*((2*i)-1);
            
            ans=ans%mod; 
            
        }
        return (int) ans;
    }
}