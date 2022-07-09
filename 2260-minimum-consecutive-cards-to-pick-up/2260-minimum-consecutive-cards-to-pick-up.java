class Solution {
    public int minimumCardPickup(int[] cards) {
     
        
        int n=cards.length;
        int ans=n+1;
        
        int[] ar=new int[1000001];
        Arrays.fill(ar,-1);
        
        for(int i=0;i<n;i++){
        int x=cards[i];    
            if(ar[x]!=-1){
                ans=Math.min(ans,i-ar[x]+1);
            }
            ar[x]=i;
                       
        }
        
        if(ans!=n+1)
        return ans;
        else return -1;
        
        
    }
}