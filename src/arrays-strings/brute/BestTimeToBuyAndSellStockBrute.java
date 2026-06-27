// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Approach: Try every buy-sell pair, track maximum profit

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i]; // sell - buy
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4})); // 5
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));   // 0
    }
