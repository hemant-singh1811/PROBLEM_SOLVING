class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length-1;
        int count = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            count = arr[mid] - mid - 1;
            if(count >= k){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(end == -1){
            return k;
        }
        return arr[end] + k - (arr[end] - end - 1);
    }
}