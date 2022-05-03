class Solution {
    
    public int maxDistance(int[] pos, int m) {
        
     if(pos.length==0) return 0;
        
     Arrays.sort(pos);
     
     int l=1;
     int h=pos[pos.length-1] - pos[0];
     
        int ans=0;
     while(l<=h){
         int mid=(l+h)/2;
         
         if(dis(mid,pos,m)<=0){
             ans=mid;
             l=mid+1;
         }else{
             h=mid-1;
         }        
     }   
      return ans;  
    }
    
    public static int dis(int d,int[] pos,int m){
        
        int n=pos.length;
        int x=d;
        int prev=-1;
        for(int i=0;i<n;i++){
        
            int el=pos[i];
            
            if(prev==-1){
                prev=el;
                m--;
            }
            else{
                if(el-prev>=d){
                    m--;
                  prev=el;
                }
            }
        }
        
        return m;
    }
}