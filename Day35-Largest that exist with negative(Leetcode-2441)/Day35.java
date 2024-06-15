import java.util.Arrays;
import java.util.HashSet;

public class Day35 {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hs = new HashSet<>();
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && hs.contains(nums[i])) {
                ans = Math.max(ans, nums[i]);
            } else if (nums[i] < 0) {
                hs.add(Math.abs(nums[i]));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Day35 solution = new Day35();

        // Test case 1
        int[] nums1 = { -1, 2, -3, 3 };
        int result1 = solution.findMaxK(nums1);
        System.out.println("Test case 1 result: " + result1); // Expected: 3

        // Test case 2
        int[] nums2 = { -1, 10, 6, 7, -7, 1 };
        int result2 = solution.findMaxK(nums2);
        System.out.println("Test case 2 result: " + result2); // Expected: 7

        // Test case 3
        int[] nums3 = { -10, -20, 30, 20, 10 };
        int result3 = solution.findMaxK(nums3);
        System.out.println("Test case 3 result: " + result3); // Expected: 10

        // Test case 4
        int[] nums4 = { 1, 2, 3, 4 };
        int result4 = solution.findMaxK(nums4);
        System.out.println("Test case 4 result: " + result4); // Expected: -1 (no such k exists)
    }
}
