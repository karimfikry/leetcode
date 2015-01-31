public class Solution_Pairwise_Greedy {
    // Using greedy pair-wise algorithm to solve the problem
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int profit = 0;
        for(int i = prices.length - 1; i > 0; i--) {
            if(prices[i] - prices[i - 1] > 0) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
