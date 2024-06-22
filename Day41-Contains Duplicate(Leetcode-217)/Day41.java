import java.util.HashSet;
import java.util.Set;

public class Day41 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();

        for (int i : nums) {
            if (hs.contains(i)) {
                return true;
            }
            hs.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        Day41 solution = new Day41();

        // Test case 1: Array with duplicates
        int[] nums1 = { 1, 2, 3, 4, 5, 1 };
        System.out.println("Test case 1: " + solution.containsDuplicate(nums1)); // Output: true

        // Test case 2: Array without duplicates
        int[] nums2 = { 1, 2, 3, 4, 5 };
        System.out.println("Test case 2: " + solution.containsDuplicate(nums2)); // Output: false

        // Test case 3: Empty array
        int[] nums3 = {};
        System.out.println("Test case 3: " + solution.containsDuplicate(nums3)); // Output: false

        // Test case 4: Array with one element
        int[] nums4 = { 1 };
        System.out.println("Test case 4: " + solution.containsDuplicate(nums4)); // Output: false

        // Test case 5: Array with all elements the same
        int[] nums5 = { 1, 1, 1, 1 };
        System.out.println("Test case 5: " + solution.containsDuplicate(nums5)); // Output: true
    }
}
