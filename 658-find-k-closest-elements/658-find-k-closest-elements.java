class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        Integer[] arr1=new Integer[arr.length];
        
        for(int i=0;i<arr.length;i++) arr1[i]=arr[i];
        
        Arrays.sort(arr1,(a,b)->{
            
            if(Math.abs(a-x)<Math.abs(b-x) ) return -1;
            
            if(Math.abs(a-x)==Math.abs(b-x) && a<b) return -1;
            
            return 1;
            
        });
     
            List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<k;i++){
            ans.add(arr1[i]);
        }
            
        Collections.sort(ans);
      return ans;
    }
}