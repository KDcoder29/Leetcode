class Day42 {
    public double findMaxAverage(int[] nums, int k) {
        // Initialize the sum of the first 'k' elements
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Set the initial maximum average to the average of the first 'k' elements
        double maxAvg = sum / k;

        // Use a sliding window to find the maximum average
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i]; // Slide the window
            maxAvg = Math.max(maxAvg, sum / k); // Update the maximum average if needed
        }

        return maxAvg;
    }

    public static void main(String[] args) {
        Day42 solution = new Day42();

        // Test case 1
        int[] nums1 = { -1 };
        int k1 = 1;
        System.out.println("Test Case 1: " + solution.findMaxAverage(nums1, k1)); // Expected output: -1.0

        // Additional test cases
        int[] nums2 = { 1, 12, -5, -6, 50, 3 };
        int k2 = 4;
        System.out.println("Test Case 2: " + solution.findMaxAverage(nums2, k2)); // Expected output: 12.75

        int[] nums3 = { 5 };
        int k3 = 1;
        System.out.println("Test Case 3: " + solution.findMaxAverage(nums3, k3)); // Expected output: 5.0

        int[] nums4 = { 0, 1, 1, 3, 3 };
        int k4 = 2;
        System.out.println("Test Case 4: " + solution.findMaxAverage(nums4, k4)); // Expected output: 3.0
    }
}
