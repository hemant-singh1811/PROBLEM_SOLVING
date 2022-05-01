class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int res = 0;
        for(int i = 1 ; i < arr.length; i++){
            int temp = 0;
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                temp = arr[i];
                if(temp > res){
                    res= i;
                }
            }
        }
        return res;
    }
}