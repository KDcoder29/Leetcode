import java.util.HashMap;

public class Day1 {
    public static int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (hm.containsKey(t.charAt(i)) == true) {

            } else {
                hm.put(t.charAt(i), i);
            }
        }
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = 0;
            if (hm.containsKey(s.charAt(i)) == true) {
                temp = hm.get(s.charAt(i));
            }
            ans = ans + Math.abs(i - temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example usage
        String s1 = "abc";
        String t1 = "bac";
        System.out.println("Permutation difference for s1 and t1: " + findPermutationDifference(s1, t1));

        String s2 = "abcde";
        String t2 = "edbac";
        System.out.println("Permutation difference for s2 and t2: " + findPermutationDifference(s2, t2));
    }
}
