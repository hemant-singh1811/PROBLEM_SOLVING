class Solution {
    
    public boolean backspaceCompare(String s, String t) {
    
        String s1="";
        
        String t1="";
        
        int ns=s.length();
        int nt=t.length();
        
        int has=0;
        for(int i=ns-1;i>=0;i--){
            
            char c=s.charAt(i);
            
            if(c=='#'){
                has++;
            }else{
                
                if(has<=0){
                    s1=c+s1;
                    has=0;
                }else
                has--;
            }
            
        }
        has=0;
        for(int j=nt-1;j>=0;j--){
            
            char c=t.charAt(j);
            
            if(c=='#'){
                has++;
            }else{  
                if(has<=0){
                    t1=c+t1;
                    has=0;
                }else
                has--;
            }
            // System.out.println(t1);
        }
        
        // System.out.println(s1);
        // System.out.println(t1);
            
        if(s1.equals(t1)) return true;
        
        return false;
    }   
}