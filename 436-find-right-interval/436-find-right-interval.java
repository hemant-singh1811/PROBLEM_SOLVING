 class pair{
     
        int el;
        int index;
        
     }

class Solution {
   
    public int[] findRightInterval(int[][] intervals) {
        
        int n=intervals.length;
        pair[] p=new pair[n];
        
        int i=0;
        for(int[] x:intervals){
            int s=x[0];
            int e=x[1];
            pair pi=new pair();
            pi.el=s;
            pi.index=i;
            p[i]=pi;            
            i++;
            
        }
        
        Arrays.sort(p,(a,b)->{
            return a.el-b.el;
        });
            
            // for(pair pd:p){
                // System.out.println(pd.el+" "+pd.index);
            // }
    i=0;
        
        int[] ans=new int[n];
        
         for(int[] x:intervals){
            int e=x[1];
            ans[i]=search(p,e,i);
             i++;
             
        }
        
        return ans;
    }
    
    public static int search(pair[] p,int el, int ii){
        
        int ans=-1;
        int i=0,j=p.length-1;
        
        while(i<=j){
            int mid=(i+j)/2;
            
            if(p[mid].el>=el  ){
                ans=p[mid].index;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
        
    }
}