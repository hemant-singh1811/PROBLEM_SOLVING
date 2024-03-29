class Solution {
public boolean checkIfExist(int[] arr) {

    Arrays.sort(arr);            
    for(int i=0 ; i<=arr.length-1 ; i++){
        int lb = 0;
        int ub = arr.length-1;
        
        while(lb <= ub){
            int mid = lb + (ub-lb)/2;
            
            if(i != mid && arr[mid] == arr[i]*2)
                return true;
            
            if(arr[mid] > arr[i]*2){
                ub = mid-1;
            }
            else
            {
                lb = mid+1;
            }
        }
    }
    return false;
    
}
}