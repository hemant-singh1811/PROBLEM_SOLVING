class Solution {
   public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0; i<stones.length; i++) {
            pq.add(stones[i]);
        }
        
        for(int i=0; i<stones.length; i++) {
            if(pq.size() >= 2) {
                int a = pq.remove();
                int b = pq.remove();
                
                if(a!=b) {
                    pq.add(Math.abs(a-b));
                }
            } else if(pq.size() == 1) {
                return pq.peek();
            } 
        }
        return 0;
    }
}