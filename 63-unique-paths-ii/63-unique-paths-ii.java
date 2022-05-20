class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int x = obstacleGrid.length;
		int y = obstacleGrid[0].length;
        for(int i = 0; i<x; i++){
		    for(int j =0 ; j<y; j++){
				if(obstacleGrid[i][j]== 1){
					obstacleGrid[i][j] = -1;
				}
			}
		}
		return helper(x - 1, y - 1, obstacleGrid);
    }
    private static int helper(int i, int j, int[][] obstacleGrid) {
		if(obstacleGrid[i][j] == -1){
			return 0;
		}
		else if (i == 0 && j == 0) {
			return 1;
		}

		else if (obstacleGrid[i][j] == 0) {
			int top = i == 0 ? 0 : helper(i - 1, j, obstacleGrid);
			int left = j == 0 ? 0 : helper(i, j - 1, obstacleGrid);
			obstacleGrid[i][j] = top + left;
		}
		
		return obstacleGrid[i][j];
	}
}