class Solution {
    public boolean isAnagram(String s, String t) {
       
        if(s.length()!=t.length()) return false;
        
        int[] a=new int[26];
        
        for(int i=0;i<s.length();i++){
        
            int as=s.charAt(i)-97;
            a[as]++;
        }
        
        for(int i=0;i<t.length();i++){
        
            int as=t.charAt(i)-97;
            a[as]--;
        }
        
        for(int x:a){
            if(x!=0) return false;
        }
        return true;
    }
}