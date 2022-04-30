class pair{
    int p;
    int b;
    
    pair(int p,int b){
        this.p=p;
        this.b=b;
    }
}

class Solution {
    public int[] maximumBeauty(int[][] items, int[] q) {
        
        int n=items.length;
        
        pair[] p=new pair[n];

        int i=0;
        
        int[] be=new int[n];
        int maxb=Integer.MIN_VALUE;
        for(int[] x:items){
            int pii=x[0];
            int b=x[1];
            pair pi=new pair(pii,b);
            p[i]=pi;
            
            be[i]=maxb;
            i++;        
        }
        Arrays.sort(p,(a,b)->{
            return a.p-b.p;
        });
            i=0;
        for(pair x:p){
            maxb=Integer.max(maxb,x.b);
            be[i]=maxb;
            i++;
        }
        
        i=0;
        int[] ans=new int[q.length];
        
        for(int x:q){
            ans[i]=search(p,x,be);
            i++;        
        }
        
        return ans;
    }
    
    public int search(pair[] p,int el,int[] b){
        int l=0;
        int h=p.length-1;
    
        int ans=Integer.MIN_VALUE;
        int i=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            
            if(p[mid].p<=el){
                i=mid; 
                l=mid+1;
            }else h=mid-1;
        }
        
      
        if(i==-1){
            return 0;
        }
          
          // for(int j=0;j<=i;j++){
            // ans=Integer.max(ans,p[j].b);
          // } 
        return b[i];
    }
}