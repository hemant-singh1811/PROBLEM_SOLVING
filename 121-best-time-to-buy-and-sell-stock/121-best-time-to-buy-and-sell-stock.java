class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        
        int[] leftmin=new int[n];
        int min=0;
        for(int i=0;i<n;i++){
            if(i==0){
                min=prices[i];
                leftmin[i]=-1;
            }else{
                leftmin[i]=min;
                min=Math.min(prices[i],min);
            }
        }
        // for(int x:leftmin)
            // System.out.print(x+" ");
   
        int maxprofit=0;
        
        for(int i=n-1;i>0;i--){
            int el=prices[i];
            maxprofit=Math.max(maxprofit,el-leftmin[i]);
        }
        
        return maxprofit;
    }
}