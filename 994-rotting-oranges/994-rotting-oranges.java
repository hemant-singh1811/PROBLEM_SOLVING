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
		while (!que.isEmpty()) {
			pos p = que.remove();
			int row = p.i;
			int col = p.j;

			if (row - 1 >= 0 && arr[row - 1][col] == 1) {
				arr[row - 1][col] = 2;
				one--;
				child.add(new pos(row - 1, col));
			}
			if (row + 1 < n && arr[row + 1][col] == 1) {
				arr[row + 1][col] = 2;
				one--;
				child.add(new pos(row + 1, col));
			}
			if (col - 1 >= 0 && arr[row][col - 1] == 1) {
				arr[row][col - 1] = 2;
				one--;
				child.add(new pos(row, col - 1));
			}
			if (col + 1 < m && arr[row][col + 1] == 1) {
				one--;
				arr[row][col + 1] = 2;
				child.add(new pos(row, col + 1));
			}

			if (que.size() == 0) {
				if (child.size() != 0)
					time++;
				while (!child.isEmpty()) {
					que.add(child.remove());
				}
			}
		
		}
		if(one==0)
		return time;
		else return -1;
		
    }
}