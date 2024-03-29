class Solution { 
	public static int numIslands(char[][] grid1) {
	        
		int r = grid1.length;
		int c = grid1[0].length;

        int[][] grid=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid1[i][j]=='1'){
                    grid[i][j]=1;
                }
            }
        } 
		int ans = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (grid[i][j] == 1) {
					ans++;
					dfs(grid, i, j);
				}
			}
		}
		return ans;
	}

	public static void dfs(int[][] grid, int i, int j) {
		int[] dx = { 1, 0, 0, -1 };
		int[] dy = { 0, 1, -1, 0 };

		grid[i][j] = 0;

		for (int k = 0; k < 4; k++) {
			int ni = i + dx[k];
			int nj = j + dy[k];
			if (limit(ni, nj, grid) && grid[ni][nj] == 1) {
				dfs(grid, ni, nj);
			}
		}

	}

	private static boolean limit(int ni, int nj, int[][] grid) {
		int r = grid.length;
		int c = grid[0].length;

		if (ni > -1 && nj > -1 && ni < r && nj < c)
			return true;

		return false;
	}


	public static int numIslands1(char[][] grid1) {
		DSU d1 = new DSU();

        
		int r = grid1.length;
		int c = grid1[0].length;

        int[][] grid=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid1[i][j]=='1'){
                    grid[i][j]=1;
                }
            }
        }
       HashMap<String,Integer> map=new HashMap<>();
		int ans = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (grid[i][j] == 1) {
					d1.create(name(i, j));
				}
			}
		} 
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (grid[i][j] == 1) {

					int[] dx = { 1, 0, -1, 0 };
					int[] dy = { 0, 1, 0, -1 };

					for (int k = 0; k < 4; k++) {
						int ci = i + dx[k];
						int nj = j + dy[k];

						if (ci < r && ci > -1 && nj < c && nj > -1 && grid[ci][nj] == 1) {
							d1.union(name(i, j), name(ci, nj));
						}
					}
				}
			}
		}

		for (String vt : d1.map.keySet()) {
			map.put(d1.find(d1.map.get(vt)).val,1);
		}

		// for (int x : d) {
			// if (x != 0)
			// 	ans++;
		// }

		return map.size();
	}

	public static String name(int i, int j) { 
		return i +"-"+ j;
	}
}
 

class Node{
	String val;
	Node parent;
	int rank;
}

  class DSU {

	HashMap<String,Node> map=new HashMap<>();
	
	void create(String x)
	{
		Node nn=new Node();
		nn.val=x;
		nn.parent=nn;
		nn.rank=0;
		
		map.put(x, nn);
	}
	
	public Node find(Node x)
	{
		if(x==x.parent)
		{
			return x;
		}
		
		Node rr=find(x.parent);
		x.parent=rr;
		return rr;
	}
	
	public void union(String x,String y)
	{
		Node s1=find(map.get(x));
		Node s2=find(map.get(y));
		
		if(s1.val==s2.val) return ;
		
		if(s1.rank>s2.rank)
		{
			s2.parent=s1;
		}
		else if(s1.rank<s2.rank)
		{
			s1.parent=s2;
		}else {
			s1.parent=s2;
			s2.rank++;
		}	
	}
}
