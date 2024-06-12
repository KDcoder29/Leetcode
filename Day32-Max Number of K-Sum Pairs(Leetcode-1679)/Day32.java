import java.util.Arrays;

public class Day32 {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int s = 0;
        int e = nums.length - 1;
        int ans = 0;
        while (s < e) {
            int sum = nums[s] + nums[e];
            if (sum == k) {
                s++;
                e--;
                ans++;
            } else if (sum < k) {
                s++;
            } else {
                e--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Day32 solution = new Day32();

        // Example test case
        int[] nums = { 1, 2, 3, 4 };
        int k = 5;

        int result = solution.maxOperations(nums, k);

        System.out.println("Number of operations: " + result);
    }
}
