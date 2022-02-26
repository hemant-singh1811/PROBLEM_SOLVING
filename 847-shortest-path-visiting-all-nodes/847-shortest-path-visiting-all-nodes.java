class Solution {
public int shortestPathLength(int[][] graph) {        
        if(graph.length == 1) return 0;
        
        int n = graph.length;
        int finish = (int) (Math.pow(2, n) - 1);
        
        Queue<int[]> queue = new LinkedList<>();
        
        Map<Integer, List<Integer>> adj = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < graph[i].length; j++) {
                temp.add(graph[i][j]);
            }
            adj.put(i, temp);
        }
        
        Map<Integer, Set<Integer>> vistedMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int current = 1 << i;
            Set<Integer> visted = new HashSet<>();
            visted.add(current);
            vistedMap.put(i, visted);
            queue.offer(new int[]{i, current});
        }

        int path = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            for(int i = 0; i < size; i++) {
                int[] current = queue.poll();
                if((current[1] & finish) == finish) return path;
                List<Integer> nextList = adj.get(current[0]);
                
                for(int e: nextList) {
                    int nextCheck = current[1] | (1 << e);
                    Set<Integer> visted = vistedMap.get(e);
                    if(!visted.contains(nextCheck)) {
                        visted.add(nextCheck);
                        queue.offer(new int[]{e, nextCheck});   
                    }
                }
            }
            path++;
        }
        
        return -1;
    }
}