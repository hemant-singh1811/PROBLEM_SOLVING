class Solution {
    public int coinChange(int[] arr, int target) {
        
       if(target==0) return 0;
        
		Arrays.sort(arr);

		int n = arr.length;

		int[] dp = new int[target + 1];

		dp[0] = 0;

		for (int i = 0; i < n; i++) {

			int el = arr[i];

			for (int j = 1; j <= target; j++) {

				int ans = dp[j];

				if (j >= el) {
					int ans1 = 0;
					if (j == el) {
						ans1 = 1;
					} else if (j > el && dp[j - el] != 0) {
						ans1 = 1 + dp[j - el];
					}
					if (ans != 0 && ans1 != 0) {
						ans = Math.min(ans, ans1);
					} else {
						if (ans1 != 0)
							ans = ans1;
					}
				}

				dp[j] = ans;
				// p(ans, " ");
			}
		
		// pt("");
		}
		int ans = dp[target];

		if (ans == 0)
			return -1;
		else
			return ans;

        
    }
}