class Solution {
    public int[] twoSum(int[] numbers, int target) {
     
        int i=0;
        int j=numbers.length-1;
        int[] arr={1,2};
        while(i<j){ 
            if(numbers[i]+numbers[j]==target){
                
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            } 
            if(numbers[i]+numbers[j]<target){
                i++;
                // return ans;
            }
            if(numbers[i]+numbers[j]>target){
                j--;
                // return ans;
            }
        }
        return arr;
    }
}