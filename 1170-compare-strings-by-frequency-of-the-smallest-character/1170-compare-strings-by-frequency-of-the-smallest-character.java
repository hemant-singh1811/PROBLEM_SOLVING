class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        
        int n=words.length;
        int[] wordfre=new int[n];
        
        for(int i=0;i<n;i++){
            
            String str=words[i];
            
            int[] alp=new int[26];
            
            int nstr=str.length();
            
            for(int j=0;j<nstr;j++){
                int c=str.charAt(j) -97;
                alp[c]++;
            }
            int ans=0;
            
            for(int x:alp){
                if(x!=0){
                    ans=x;
              break;
                }
            }
            wordfre[i]=ans;
            
        }
        
        Arrays.sort(wordfre);
        
        int n1=queries.length;
        
        int[] qfre=new int[n1];
        
        for(int i=0;i<n1;i++){
            
            String str=queries[i];
            
            int[] alp=new int[26];
            
            int nstr=str.length();
            
            for(int j=0;j<nstr;j++){
                int c=str.charAt(j) -97;
                alp[c]++;
            }
            int ans=0;
            
            for(int x:alp){
                if(x!=0){
                    ans=x;
              break;
                }
            }
         qfre[i]=ans;
            
        }
        int[] ans=new int[n1];
        for(int i=0;i<n1;i++){
            int el=qfre[i];
            //no. of element who are greater than x in wordfre
            ans[i]=greater(el,wordfre);
        }
        
        return ans;
    }
    
    public static int greater(int el,int[] arr){
        int l=0;
        int h=arr.length-1;
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            
            if(arr[mid]<=el){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
            
        }
        if(ans==-1) return arr.length;
        else  return arr.length-ans-1; 
    }
}