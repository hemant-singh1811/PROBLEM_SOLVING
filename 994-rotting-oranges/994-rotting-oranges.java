class pos {
	int i;
	int j;

	pos(int i, int j) {
		this.i = i;
		this.j = j;
	}
}

class Solution {
    public int orangesRotting(int[][] arr) {
        
        int n = arr.length;
		int m = arr[0].length;

		Queue<pos> que = new ArrayDeque<>();
        
		int one = 0;
        
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 2)
					que.add(new pos(i, j));
				else if (arr[i][j] == 1)
					one++;
			}
		}

		if (que.size() == 0) {
			if (one == 0)
				return 0;
			else
				return -1;
		}
        
        if(one==0) return 0;
        
		int time = 0;
        
		Queue<pos> child = new ArrayDeque<>();
		int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        while (!que.isEmpty()) {
			pos p = que.remove();
			int row = p.i;
			int col = p.j;

            for(int i=0;i<4;i++){
                
                int newx=row+dx[i];
                int newy=col+dy[i];
                
                if (newx>= 0 && newy>=0 && newx<n && newy<m && arr[newx][newy] == 1) {
				arr[newx][newy] = 2;
				one--;
				child.add(new pos(newx, newy));
			    }   
              } 
			if (que.size() == 0) {
				if (child.size() != 0)  time++;
                
				while (!child.isEmpty()) 
					que.add(child.remove());
				
			}
		}
        
		if(one==0)  return time;
		else        return -1;
		
    }
}