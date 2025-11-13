class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        
        // Iterate through the prices array
        for (int i = 1; i < prices.length; i++) {
            // If the current price is greater than the previous price, we can make a profit
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1]; // Buy at prices[i-1] and sell at prices[i]
            }
        }
        
        return totalProfit;
    }
}
