class Solution {
    
    
    public int minEatingSpeed(int[] piles, int h) {
    
        
        long l=1;
        long j=Integer.MIN_VALUE;
        
        for(int x:piles) j=Math.max(j,x);
        long ans=-1;
        
        while(l<=j){
        long mid=(l+j)/2;
            
            int x=hour(mid,piles);
            // System.out.println(mid+" "+x);
            if(x<=h){ 
                ans=mid;
                j=mid-1; 
            } 
            else l=mid+1;
                      
        }
        return (int)ans;
    }
    
    public int hour(long mid,int[] piles){
        int ans=0;
        
        for(int x:piles){
            if(x>mid){
                ans+=Math.ceil((double)x/(double)mid);
            }else
            {
                ans++;
            }
        }
        
        return ans;
    }
    
}