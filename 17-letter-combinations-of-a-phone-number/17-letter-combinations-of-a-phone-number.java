class Solution {
    static List<String> ans;
    public List<String> letterCombinations(String digits) {
        ans=new ArrayList<>();
     String[] arr=new String[10];
      
        if(digits.length()==0) return ans;
        arr[2]="abc";
        arr[3]="def";
        arr[4]="ghi";
        arr[5]="jkl";
        arr[6]="mno";
        arr[7]="pqrs";
        arr[8]="tuv";
        arr[9]="wxyz";
        rec(0,digits,"",arr);
        return ans;
        
    }
    
    public static void rec(int i,String digits,String str,String[] arr){
        
        if(i==digits.length()){
            ans.add(str);
            return;
        }
         
            int x=Integer.parseInt(""+digits.charAt(i));
            
          if(x==1)
            rec(i+1,digits,str,arr);
        else{
            
            String get=arr[x];
            
            for(int j=0;j<get.length();j++){
                rec(i+1,digits,str+get.charAt(j),arr);
            }
        }
       
    }
}