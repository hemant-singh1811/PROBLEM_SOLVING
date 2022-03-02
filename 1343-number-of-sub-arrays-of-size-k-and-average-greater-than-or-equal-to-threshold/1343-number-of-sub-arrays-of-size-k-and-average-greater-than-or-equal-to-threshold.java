class Solution {
    public int numOfSubarrays(int[] arr, int k, int th) {
        
        
        int sum=0;
        int ans=0;
        
        int n=arr.length;
        
        for(int i=0;i<k;i++) sum+=arr[i];
        
        if((sum/k) >=th) ans++;
        
        for(int i=1;i<=n-k;i++){
            sum-=arr[i-1];
            sum+=arr[i+k-1];
       
            if((sum/k) >=th) ans++;            
        }
        
        return ans;
    }
}