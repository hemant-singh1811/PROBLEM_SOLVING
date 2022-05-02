class Solution {
    public int[] sortArrayByParity(int[] num) {
     
       
        int j=0;
        int n=num.length;
        int[] ans=new int[n];
        
        while(j<n){
            
            for(int i=0;i<n;i++){
                if(num[i]%2==0 && j<n){
                    ans[j]=num[i];
                    num[i]=-1;
                j++;
                }
            }
            for(int i=0;i<n;i++){
                if(num[i]%2==1 && j<n){
                    ans[j]=num[i];
                    num[i]=-1;
                    j++;
                }
            }         
        }
        
        return ans;
    }
}