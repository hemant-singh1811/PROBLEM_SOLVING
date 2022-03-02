class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int n1=s.length();
        
        int n2=t.length();
        
        if(n1==0) return true;
        
         if(n1!=0 && n2==0) return false;        
        
        int j=0;
        for(int i=0;i<n2 && j<n1;i++){
            char c=t.charAt(i);
            
            if(j<n1 && c==s.charAt(j)) j++;
            
            if(j==n1) return true;
            
            
        }
        return false;
    }
}