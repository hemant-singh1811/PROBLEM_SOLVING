class Solution {
    
    
    public boolean validateStackSequences(int[] pushed, int[] popped) {
    
        
        
        Stack<Integer> stk=new Stack<>();
        
        int i=0;
        int n=pushed.length;
        
        for(int x:popped){
            
            if(!stk.isEmpty() && stk.peek()==x){   
                stk.pop(); 
            }else{
                while(i<n && pushed[i]!=x){
                    stk.push(pushed[i]);  
                    i++;
                }                
                if(i>=n || pushed[i]!=x){ 
                    return false;
                }else i++;
            }            
        }
        if(stk.size()==0)
        return true;    
        else return false;
    }
    
    
}