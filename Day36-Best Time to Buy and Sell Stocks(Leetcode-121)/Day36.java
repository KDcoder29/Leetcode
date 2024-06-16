public class Day36 {
    public int maxProfit(int[] prices) {
        int minimum = prices[0];
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            minimum = Math.min(prices[i], minimum);
            int profit = prices[i] - minimum;
            ans = Math.max(ans, profit);
        }
        return ans;
    }

    public static void main(String[] args) {
        Day36 solution = new Day36();

        // Test case 1
        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Max profit for prices1: " + solution.maxProfit(prices1)); // Output: 5

        // Test case 2
        int[] prices2 = { 7, 6, 4, 3, 1 };
        System.out.println("Max profit for prices2: " + solution.maxProfit(prices2)); // Output: 0

        // Additional test cases
        int[] prices3 = { 1, 2, 3, 4, 5 };
        System.out.println("Max profit for prices3: " + solution.maxProfit(prices3)); // Output: 4

        int[] prices4 = { 5, 4, 3, 2, 1 };
        System.out.println("Max profit for prices4: " + solution.maxProfit(prices4)); // Output: 0
    }
}
