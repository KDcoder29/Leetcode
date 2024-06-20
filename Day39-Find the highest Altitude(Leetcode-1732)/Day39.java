public class Day39 {
    // Method to find the largest altitude
    public int largestAltitude(int[] gain) {
        int ans = 0; // Initialize the maximum altitude to 0
        int sum = 0; // Initialize the current altitude to 0

        // Iterate through the gain array to compute the altitude changes
        for (int i = 0; i < gain.length; i++) {
            sum = sum + gain[i]; // Update the current altitude
            ans = Math.max(sum, ans); // Update the maximum altitude if the current altitude is higher
        }

        return ans; // Return the maximum altitude found
    }

    // Main method to test the largestAltitude method
    public static void main(String[] args) {
        Day39 solution = new Day39();

        // Test case 1
        int[] gain1 = { -5, 1, 5, 0, -7 };
        int result1 = solution.largestAltitude(gain1);
        System.out.println("Test case 1 - The largest altitude is: " + result1); // Expected output: 1

        // Test case 2
        int[] gain2 = { -4, -3, -2, -1, 4, 3, 2 };
        int result2 = solution.largestAltitude(gain2);
        System.out.println("Test case 2 - The largest altitude is: " + result2); // Expected output: 0

        // Test case 3
        int[] gain3 = { 1, 2, 3, 4, 5 };
        int result3 = solution.largestAltitude(gain3);
        System.out.println("Test case 3 - The largest altitude is: " + result3); // Expected output: 15

        // Test case 4
        int[] gain4 = { -1, -2, -3, -4, -5 };
        int result4 = solution.largestAltitude(gain4);
        System.out.println("Test case 4 - The largest altitude is: " + result4); // Expected output: 0

        // Test case 5
        int[] gain5 = { 0, 0, 0, 0 };
        int result5 = solution.largestAltitude(gain5);
        System.out.println("Test case 5 - The largest altitude is: " + result5); // Expected output: 0

        // Test case 6
        int[] gain6 = { 10, -5, 3, 2, 1 };
        int result6 = solution.largestAltitude(gain6);
        System.out.println("Test case 6 - The largest altitude is: " + result6); // Expected output: 11
    }
}
