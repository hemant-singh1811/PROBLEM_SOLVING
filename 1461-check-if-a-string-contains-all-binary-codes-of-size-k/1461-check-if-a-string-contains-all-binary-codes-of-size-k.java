class Solution {
    public boolean hasAllCodes(String s, int k) {
      Set<String>set=new HashSet<>();
       for(int i=0;i+k<=s.length();i++){
           set.add(s.substring(i,i+k));
       }
        return set.size()==(1<<k);
    }
}