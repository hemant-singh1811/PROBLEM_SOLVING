

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int  res =0;
        for(int num1: arr1){
            int count =0;
            for(int num2: arr2){
                if(Math.abs(num1-num2) <=d)
                    count++;
            }
            if(count ==0)res++;
        }
        return res;
    }
}