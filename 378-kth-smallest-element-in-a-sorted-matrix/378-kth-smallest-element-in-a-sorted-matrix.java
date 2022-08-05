class Solution {
    public int kthSmallest(int[][] matrix, int k) {

       int n=matrix.length;
        
        int[] a=new int[n*n];
        int i=0;
        
        for(int[] x: matrix){
            for(int y:x){
                a[i]=y;
                i++;
            }
        }
        
        Arrays.sort(a);
        
        return a[k-1];

    }
}