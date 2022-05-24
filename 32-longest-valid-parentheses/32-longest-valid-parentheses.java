class Solution {
 public int longestValidParentheses(String s) {
        int ans=0,o=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') o++;
            else c++;
            if(c>o) c=o=0;
            if(c==o) ans = Math.max(ans,o+c);
        }
        o=c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='(') o++;
            else c++;
            if(c<o) c=o=0;
            if(c==o) ans = Math.max(ans,o+c);
        }
 return ans;   
 }
}