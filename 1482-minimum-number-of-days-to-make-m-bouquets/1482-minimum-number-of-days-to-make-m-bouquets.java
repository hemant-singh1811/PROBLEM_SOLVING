class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        int n=bloomDay.length;
        
        if((m*k)>n) return -1;
            
        int l=1;
        int h=Integer.MIN_VALUE;
        
        for(int x:bloomDay){
            h=Math.max(x,h);
        }
     
        int ans=0;
        
        while(l<=h){
            int mid=(2*l-(l-h))/2;
            
            if(is(bloomDay,m,k,mid)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }            
        }       
        return ans;
    }
    
    public static boolean is(int[] fl,int m,int k,int d){
        int l=0;
        int ans=0;
        
    for(int x:fl){
       
        if(x<=d){
            l++;
        }else{
            l=0;
        }
        if(l==k){
            ans++;
            l=0;
        } 
    } 
         
        if(ans>=m){
            return true;
        }else return false;
    }
    
}