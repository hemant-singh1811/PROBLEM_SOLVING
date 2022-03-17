class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
      int sc=0;
        int n=s.length();
        
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            
            if(c=='('){
                st.push(sc);
                sc=0;
            }else{ 
                sc=st.pop()+Math.max(2*sc,1);
            }
        }
        return sc;
    }
}