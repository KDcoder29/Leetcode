import java.util.HashSet;

public class Day23 {

    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<>();

        for (int i = 0; i < jewels.length(); i++) {
            jewelSet.add(jewels.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewelSet.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Day23 solution = new Day23();

        // Test case 1
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        int result1 = solution.numJewelsInStones(jewels1, stones1);
        System.out.println("Test case 1: " + result1); // Output: 3

        // Test case 2
        String jewels2 = "z";
        String stones2 = "ZZ";
        int result2 = solution.numJewelsInStones(jewels2, stones2);
        System.out.println("Test case 2: " + result2); // Output: 0

        // Additional test cases can be added here
    }
}
