class Solution {
    
    public int mySqrt(int x) {
    
        long l=1;
        long h=x;
        long ans=0;
        
        while(l<=h){
            long mid=(l+h)/2;
            
            if(mid*mid>x){
                h=mid-1;
            }else{
                ans=mid;
                l=mid+1;
            }
            
            
        }
        
     return (int)ans;   
    }
    
}