class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        int ans=0;
        
        Arrays.sort(boxTypes,(a,b)->{
            return b[1]-a[1];
        });
       
        for(int[] x:boxTypes){ 
                if(truckSize!=0){ 
                    int min=Math.min(truckSize,x[0]);
                    
                    truckSize-=min;
                    ans+=min*x[1];
                }  
            } 
        return ans;
        
    }
}