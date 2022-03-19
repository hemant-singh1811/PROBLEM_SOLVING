class FreqStack {
        
        int cnt;
        Map<Integer,Integer> map;
        PriorityQueue<Pair> pq;
        

    public FreqStack() {
        cnt = 0;
        map = new HashMap<>();
        pq = new PriorityQueue<>();
    }
    
    public void push(int val) {
        map.put(val,map.getOrDefault(val,0) + 1);
        cnt++;
        Pair p = new Pair(val,map.get(val),cnt);
        pq.offer(p);
    }
    
    public int pop() {
        int res = pq.peek().val;
        map.put(res,map.get(res) - 1);
        return pq.poll().val;
    }
    
    
     public class Pair implements Comparable<Pair>{
        
        int freq;
        int val;
        int idx;
        
        public Pair(int val,int freq,int idx){
            this.val  = val;
            this.freq = freq;
            this.idx = idx;
        }
        
        public Pair(){
            
        }
        
        public int compareTo(Pair o){
            if(this.freq == o.freq){
                return o.idx - this.idx;
            }else{
                return o.freq - this.freq;
            }
        }
     }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */