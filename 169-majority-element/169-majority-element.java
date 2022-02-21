class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int x:nums){
           map.put(x,map.getOrDefault(x,0)+1);
        }
     
        int el=0;
        int fre=0;
        
        for(int x:map.keySet()){
            
           if(fre<map.get(x)){
               fre=map.get(x);
               el=x;
           }
            
        }
        return el;
    }
}