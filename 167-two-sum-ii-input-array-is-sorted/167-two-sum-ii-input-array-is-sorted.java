class Solution {
    public int[] twoSum(int[] numbers, int target) {
     
        int i=0;
        int j=numbers.length-1;
        int[] arr={1,1};
        while(i<=j){ 
            int mid=(i+j)/2;
            if(target>0 && numbers[mid]>target){
                j=mid-1;
            }
            else{
                if(numbers[i]+numbers[mid]>target){
                    j=mid-1;
                }
            if(numbers[i]+numbers[j]==target){ 
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            } 
            if(numbers[i]+numbers[j]<target){
                i++; 
            }
            if(numbers[i]+numbers[j]>target){
                j--; 
            }
        }
        }
        return arr;
    }
}