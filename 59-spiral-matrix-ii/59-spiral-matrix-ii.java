class Solution {
    public int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		int rs = 0;
		int re = matrix.length - 1;
		int cs = 0;
		int ce = matrix[0].length - 1;
		int num = 1;
		while (rs <= re && cs <= ce) {
			// go right
			for (int i = cs; i <= ce; i++) {
				matrix[rs][i] = num++;
			}
			rs++;
			// go down
			for (int i = rs; i <= re; i++) {
				matrix[i][ce] = num++;
			}
			ce--;
			// go left
			for (int i = ce; i >= cs; i--) {
				matrix[re][i] = num++;
			}
			re--;
			// go up
			for (int i = re; i >= rs; i--) {
				matrix[i][cs] = num++;
			}
			cs++;
		}
		return matrix;
	}
}