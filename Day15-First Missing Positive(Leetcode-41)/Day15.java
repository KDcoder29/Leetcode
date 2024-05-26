public class Day15 {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] < 1 || nums[i] > n || nums[i] - 1 == i) {
                i++;
            } else {
                int idx = nums[i] - 1;
                if (nums[i] == nums[idx]) {
                    i++;
                } else {
                    swap(nums, i, idx);
                }
            }
        }

        for (int j = 0; j < n; j++) {
            if (j + 1 != nums[j]) {
                return j + 1;
            }
        }
        return n + 1;
    }

    public static void swap(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }

    public static void main(String[] args) {
        Day15 solution = new Day15();

        // Test case 1
        int[] nums1 = { 3, 4, -1, 1 };
        System.out.println("First missing positive (Test case 1): " + solution.firstMissingPositive(nums1)); // Expected
                                                                                                             // output:
                                                                                                             // 2

        // Test case 2
        int[] nums2 = { 1, 2, 0 };
        System.out.println("First missing positive (Test case 2): " + solution.firstMissingPositive(nums2)); // Expected
                                                                                                             // output:
                                                                                                             // 3

        // Test case 3
        int[] nums3 = { 7, 8, 9, 11, 12 };
        System.out.println("First missing positive (Test case 3): " + solution.firstMissingPositive(nums3)); // Expected
                                                                                                             // output:
                                                                                                             // 1

        // Test case 4
        int[] nums4 = { 1, 2, 3 };
        System.out.println("First missing positive (Test case 4): " + solution.firstMissingPositive(nums4)); // Expected
                                                                                                             // output:
                                                                                                             // 4
    }
}
