class Solution {
    public int maxProfit(int[] prices, int fee) {
        int res = 0, buy = -prices[0]-fee;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] + buy > 0){
                res += prices[i] + buy;
                buy = -prices[i];
            }else if (buy < -prices[i]-fee){
                buy = -prices[i]-fee;
            }
        }return res;
    }
}