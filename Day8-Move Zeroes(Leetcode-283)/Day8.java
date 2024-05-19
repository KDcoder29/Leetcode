import java.util.Arrays;

public class Day8 {
    public void moveZeroes(int[] nums) {
        int last = 0;
        // First pass: move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[last] = nums[i];
                last++;
            }
        }
        // Second pass: fill the remaining positions with zeros
        for (int i = last; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        Day8 sol = new Day8();

        int[] nums = { 0, 1, 0, 3, 12 };
        System.out.println("Before: " + Arrays.toString(nums));

        sol.moveZeroes(nums);

        System.out.println("After: " + Arrays.toString(nums));
    }
}
