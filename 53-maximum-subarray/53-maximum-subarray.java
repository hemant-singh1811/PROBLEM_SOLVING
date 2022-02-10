class Solution {
    public int maxSubArray(int[] arr) {
        	int n = arr.length;

		int overallsum = arr[0];

		int sum = arr[0];

		for (int i = 1; i < n; i++) {

			int el = arr[i];

			if (el > sum + el) {
				sum = el;
			} else {
				sum += el;
			}

			overallsum = Math.max(overallsum, sum);
		}

		return overallsum;
    }
}