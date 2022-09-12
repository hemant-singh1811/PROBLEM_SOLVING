class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        
        int score=0;
        int n=tokens.length;
        int i=0;
        int j=n-1;
        
        int ans=0;
        
        while(i<=j){
            
            if(power<tokens[i]){
                if(score>0){
                score--;
                power+=tokens[j];
                j--;
                }else break;
            }else{
                power-=tokens[i];
                i++;
                score++;
            }
            ans=Math.max(ans,score);
            
            
        }
        
        
        return ans;
        
    }
}