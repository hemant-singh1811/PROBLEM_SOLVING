class Solution {
    public int maxVowels(String s, int k) {
        
        int ans=0;
        int crrm=0;
        int n=s.length();
        
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            
            if(isvowel(c)) crrm++; 
            
        }
        ans=crrm;
        for(int i=1;i<=n-k;i++){
            
            char prev=s.charAt(i-1);
            char next=s.charAt(i+k-1);
            
            if(isvowel(prev)) crrm--;
            if(isvowel(next)) crrm++;
            
            ans=Math.max(ans,crrm);
            
        }
        
        
        return ans;
    }
    
    public boolean isvowel(char c){
        
        if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u') return true;
        
        return false;
        
    }
}