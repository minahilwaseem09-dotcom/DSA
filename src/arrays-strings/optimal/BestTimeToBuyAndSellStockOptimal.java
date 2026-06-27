// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach: Track running min price, calculate profit at each step

public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // sabse sasta din
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // sasta din mila, update karo
            } else {
                // aaj bechne ka profit check karo
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

void main( ) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4})); // 5
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));   // 0
}