class Solution {
    public int countNegatives(int[][] grid) {
        
        int count=0;
        
        for(int[]x :grid) count+=negcount(x);
        
        return count;
    }
    
    public int negcount(int[] arr){
        
        int i=0;
        int j=arr.length-1;
        
        while(i<=j){
            int mid=(i+j)/2;
            
            if(arr[mid]<0)  j=mid-1;
            else i=mid+1;
        }
        return arr.length-i;
    }
    
}