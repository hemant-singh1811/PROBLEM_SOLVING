class Solution {
    public int addDigits(int num) { 
         if (num < 10)
			return num;
 
			while (num > 9) {
				int f = num / 10;
				int s = num % 10;

				num =f  + s;

			}  
			return num;
    }
}