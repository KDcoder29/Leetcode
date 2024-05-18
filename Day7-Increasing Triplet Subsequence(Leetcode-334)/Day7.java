public class Day7 {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= firstSmallest) {
                firstSmallest = nums[i];
            } else if (nums[i] <= secondSmallest) {
                secondSmallest = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Day7 solution = new Day7();

        // Test case 1
        int[] nums1 = { 1, 2, 3, 4, 5 };
        System.out.println("Test case 1: " + solution.increasingTriplet(nums1)); // Output: true

        // Test case 2
        int[] nums2 = { 5, 4, 3, 2, 1 };
        System.out.println("Test case 2: " + solution.increasingTriplet(nums2)); // Output: false

        // Test case 3
        int[] nums3 = { 2, 1, 5, 0, 4, 6 };
        System.out.println("Test case 3: " + solution.increasingTriplet(nums3)); // Output: true

        // Test case 4
        int[] nums4 = { 2, 4, -2, -3 };
        System.out.println("Test case 4: " + solution.increasingTriplet(nums4)); // Output: false

        // Test case 5
        int[] nums5 = { 10, 1, 5, 3, 2, 8 };
        System.out.println("Test case 5: " + solution.increasingTriplet(nums5)); // Output: true
    }
}
