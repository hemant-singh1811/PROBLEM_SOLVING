class Solution {
    public int countEven(int n) {
 
        int ans=0;
        
        for(int i=1;i<=n;i++){
            int x=i;
            
            int count=0;
            
            while(x!=0){
                count+=x%10;
                 x=x/10;
                }
            if(count%2==0) ans++;
        }
        return ans;
    }
}