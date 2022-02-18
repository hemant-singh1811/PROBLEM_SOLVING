class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        int count=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        HashMap<Integer,Integer> map1=new HashMap<>();
        
       for(int x:nums1){
           for(int y:nums2){
               int sum=x+y;
               
               if(map.containsKey(sum)){
                   int of=map.get(sum);
                   map.put(sum,of+1);
               }
               else map.put(sum,1);
           }
       }
        
        
       for(int x:nums3){
           for(int y:nums4){
               int sum=x+y; 
               if(map1.containsKey(sum)){
                   int of=map1.get(sum);
                   map1.put(sum,of+1);
               }
               else map1.put(sum,1);
           }
       }
        
        for(int x:map.keySet()){
            
            if(map1.containsKey(-x)){
                count+=map.get(x)*map1.get(-x);
            }
            
        }
        
        return count;
        
    }
}