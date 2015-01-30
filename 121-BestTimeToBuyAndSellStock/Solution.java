public class Solution {
    public int maxProfit(int[] prices) {
        int min = 0;
        int maxDifference = 0;
        int buy = 0, sell = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < prices[min]) {
                min = i;
            }

            int diff = prices[i] - prices[min];
            if(diff > maxDifference) {
                buy = min;
                sell = i;
                maxDifference = diff;
            }
        }

        return maxDifference;
    }
}
