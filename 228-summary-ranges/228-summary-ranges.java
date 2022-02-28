class Solution {
    public List<String> summaryRanges(int[] arr) {
        
        
        List<String> ans=new ArrayList<>();
        
        int n=arr.length;
        if(n==0) return ans;
        int f=arr[0];
        int l=f;
        String subans=""+f;
        for(int i=1;i<n;i++){
         
            if(l+1==arr[i]){
                
                l=l+1;
                
            }else{
                if(l!=f)
                subans+="->"+l;
               
                ans.add(subans);
                
                f=arr[i];
                
                subans=""+f;
                
                l=f;
            }
        }
        if(l!=f)
        ans.add(subans+"->"+l);
     else
         ans.add(subans);
        return ans;
        
    }
}