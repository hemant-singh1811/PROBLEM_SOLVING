// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid1) {
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
		int[] dx = { 1, 0, 0, -1,1 ,1,-1,-1};
		int[] dy = { 0, 1, -1, 0,1,-1,1 ,-1};

		grid[i][j] = 0;

		for (int k = 0; k < 8; k++) {
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

    
}