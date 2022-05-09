class Solution {

    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][2];
        for(int[] row: dp)
            Arrays.fill(row, Integer.MIN_VALUE);
       
        return f(0, values, n, 0 ,dp);
    }
    
    public int f(int i, int[] values, int n, int flag, int[][] dp){
	 // If I am at last element, and If I need to pick up the second element, I pick it up
        if( i == n-1 && flag == 1)
            return values[i] - i;
		// If I have crossed the limit of array, I return the lowest value, since I didn't find a pair at all
        if( i >= n)
            return Integer.MIN_VALUE;
        if(dp[i][flag] != Integer.MIN_VALUE)
            return dp[i][flag];
		// When I am picking the first element, I can either pick it and add values[i] + i to it, or I dont pick it, and proceed
		// Once I pick the first element , I change the flag value, If I dont pick the first value I dont change the flag value
        if(flag == 0)
            return dp[i][flag] = Math.max (f(i+1, values, n, 0, dp), 
                                           values[i] + i + f(i+1, values, n, 1, dp));
		 // Now I can either pick up the second element, or not pick the second element
		 // If i have picked up the second element I return values[i] - i , and If I haven't picked up, I proceed further
        else {
            return dp[i][flag] = Math.max(f(i+1, values, n, 1, dp), values[i] - i);
        }     
    }
}