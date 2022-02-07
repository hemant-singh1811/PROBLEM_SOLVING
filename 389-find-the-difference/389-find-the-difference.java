class Solution {
    public char findTheDifference(String s, String t) {
     
        int[] a=new int[26];
            
            int n=t.length();
        
        for(int i=0;i<n;i++)
        {
            int ch=t.charAt(i)-97;
            
            a[ch]+=1;
        }
        
        n=s.length();
        for(int i=0;i<n;i++)
        {
              int ch=s.charAt(i)-97;
            
            a[ch]-=1;
        }
            
        for(int i=0;i<26;i++){
            
            if(a[i]!=0){
                char ans=(char) (i+97);
                // System.out.println("ans : "+ans);
                return ans;
            }
            
        }
        return ' ';
    }
}