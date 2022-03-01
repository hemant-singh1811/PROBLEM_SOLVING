class Solution {
    public int[] countBits(int n) {
        
        int[] ans=new int[n+1];
        if(n>0)
        ans[1]=1;
        
        for(int i= 2;i<=n;i++){
            
            int count=0;
            
            int x=i;
            
            while(x!=0){ 
                if((x&1)==1) count++; 
                x=x>>1;
            }
            
            ans[i]=count;
            
        }
        
        
        return ans;
        
    }
}