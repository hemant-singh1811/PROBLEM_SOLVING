class Solution {
    
    public char nextGreatestLetter(char[] letters, char target) {
    
        int l=0;
        int h=letters.length-1;
        int as=(int) target-96;
        char ans=' ';
        while(l<=h){
            
            int mid=(l+h)/2;
            
            int c=(int) letters[mid]-96;
            
         if(c>as)
         {
             ans=letters[mid];
             h=mid-1;
         }   else{
            l=mid+1;     
         }
            
        }
        if(ans==' ') return letters[0];
        return ans;
    }
    
}