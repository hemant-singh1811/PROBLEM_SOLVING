class Solution {
    
    public boolean isBipartite(int[][] graph) {
     
//         1-black
//         0-white
        
        int n=graph.length;
        
        int[] vis=new int[n];
        Arrays.fill(vis,-1);
        for(int i=0;i<n;i++){
            if(vis[i]==-1){
                if(DFS(i,-1,graph,1,vis)==false) return false;
            }
        } 
        return true;
    }
    
    public static boolean DFS(int node,int parent,int[][] graph,int curr,int[] vis){
        
        if(vis[node]!=-1 && vis[node]==curr) return true;
        
        if(vis[node]!=-1 && vis[node]!=curr) return false;
        
        vis[node]=curr;
        
        for(int nbr:graph[node]){
            if(nbr!=parent){
                // curr=1-curr;
            if(DFS(nbr,node,graph,1-curr,vis)==false) {
                // System.out.println(node+","+nbr);
                return false;}
                
                }
        }        
        return true;
    }
    
}