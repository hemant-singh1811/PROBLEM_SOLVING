class Solution {
    
    public int maxConsecutiveAnswers(String a, int k) {
     
        int n=a.length();
        
        int l=1;
        int h=n;
        
        int ans=0;
        while(l<=h){
            int mid=(2*l-(l-h))/2;
            
            if(is(a,k,mid)){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
    
    public static boolean is(String a,int k,int c){
        
        int n=a.length();
        
        int t=0;
        int f=0;
        
        for(int i=0;i<c;i++){
         
            char c1=a.charAt(i);
            
            if(c1=='T'){
                t++;
            }
            else f++;
            
        }
        
        if(Math.max(t,f)+k>=c) return true;
        
        for(int i=1;i<n-c+1;i++){
            
            char c1=a.charAt(i-1);
            
            if(c1=='T'){
                t--;
            }
            else f--;
            
            c1=a.charAt(i+c-1);
            
            if(c1=='T'){
                t++;
            }
            else f++;
            
        if(Math.max(t,f)+k>=c) return true;
            
        }
      return false;
    }
    
} 