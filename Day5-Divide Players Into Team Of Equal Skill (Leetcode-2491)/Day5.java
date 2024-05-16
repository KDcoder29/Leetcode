import java.util.Arrays;

public class Day5 {
    public long dividePlayers(int[] skill) {
        long ans = 0;
        Arrays.sort(skill);
        int start = 0;
        int end = skill.length - 1;
        int constant = skill[start] + skill[end];

        while (start < end) {
            if (skill[start] + skill[end] != constant) {
                return -1;
            } else {
                int temp = skill[start] * skill[end];
                ans += temp;
            }
            start++;
            end--;
        }

        return ans;
    }

    public static void main(String[] args) {
        Day5 solution = new Day5();

        // Test case 1
        int[] skill1 = { 3, 2, 5, 1, 3, 4 };
        System.out.println("Test case 1: " + solution.dividePlayers(skill1)); // Output: 22

        // Test case 2
        int[] skill2 = { 3, 4 };
        System.out.println("Test case 2: " + solution.dividePlayers(skill2)); // Output: 12

        // Test case 3
        int[] skill3 = { 1, 1, 2, 3 };
        System.out.println("Test case 3: " + solution.dividePlayers(skill3)); // Output: -1

        // Additional test case
        int[] skill4 = { 5, 5, 5, 5, 5, 5, 5, 5 };
        System.out.println("Additional test case: " + solution.dividePlayers(skill4)); // Output: 100
    }
}
