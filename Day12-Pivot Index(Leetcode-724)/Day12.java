public class Day12 {
    public int pivotIndex(int[] nums) {
        int[] pf = new int[nums.length];
        pf[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pf[i] = pf[i - 1] + nums[i];
        }
        if (pf[nums.length - 1] - pf[0] == 0) {
            return 0;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            int rsum = pf[nums.length - 1] - pf[i];
            int lsum = pf[i - 1];
            if (rsum == lsum) {
                return i;
            }
        }

        if (pf[nums.length - 2] == 0) {
            return nums.length - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Day12 solution = new Day12();

        // Test case
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int pivotIndex = solution.pivotIndex(nums);

        System.out.println("Pivot Index: " + pivotIndex);
    }
}
