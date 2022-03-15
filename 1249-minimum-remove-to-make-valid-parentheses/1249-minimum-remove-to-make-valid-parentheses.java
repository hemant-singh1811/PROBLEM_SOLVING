class Solution {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> stk=new Stack<>();
        
        int n=s.length();
        
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            
            if(c=='('){
                stk.push(i);
            }else if(c==')'){
                if(stk.size()!=0 && s.charAt(stk.peek())=='(')
                    stk.pop();
                else
                    stk.push(i);
            }
        }
        
        String ans="";
        
        
            // System.out.println("peek : "+stk.peek());
        
        for(int i=n-1;i>=0;i--){ 
                if(stk.size()!=0 && stk.peek()==i){
            // System.out.println("peek : "+stk.peek());
                    stk.pop();
                }else{   
                char c=s.charAt(i);
                ans=""+c+ans;                
            }            
        }
        
        return ans;
    }
}