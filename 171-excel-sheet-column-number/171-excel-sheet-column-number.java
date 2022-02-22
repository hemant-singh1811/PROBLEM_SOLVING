 
class Solution {
  public static  int titleToNumber(String columnTitle) {
        int result = 0;
      int n=columnTitle.length();
        for(int i=0;i<n;i++)
        {
			 char c=columnTitle.charAt(i);
            int d = c - 'A' + 1;
            result = result * 26 + d;
        }
        return result;
    }
}