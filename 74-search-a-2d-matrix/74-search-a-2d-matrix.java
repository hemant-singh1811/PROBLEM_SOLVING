class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
    
        int i=matrix.length;
        int j=matrix[0].length;
        
        //identify the row
        int row=0;
        for(int k=0;k<i;k++){
            if(target<=matrix[k][j-1]){
                row=k;
                break;
            }   
        }
        i=0;
        j--;
        while(i<=j)
        {
            int mid=(i+j)/2;
            
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]>target){
                j=mid-1;
            }else i=mid+1;
        }

// System.out.println(row);
        
        return false;
        
    }
}