class Solution {
    public int findCenter(int[][] edges) {
     
        int n=edges.length;
        int[] path=new int[n+2];
        
        for(int[] x:edges){
            path[x[0]]++;
            path[x[1]]++;
        }
        
        int ans=0;
        
        for(int i=1;i<=n+1;i++){
            if(path[i]==n) return i;
        }
     return -1;
    }
}