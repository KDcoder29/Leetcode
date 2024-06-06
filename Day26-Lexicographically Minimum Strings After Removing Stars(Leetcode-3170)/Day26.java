import java.util.*;

class Day26 {
    public String clearStars(String s) {
        List<List<Integer>> indexes = new ArrayList<>();
        int n = s.length();

        // Initialize lists for each character 'a' to 'z'
        for (int i = 0; i < 26; i++) {
            indexes.add(new ArrayList<>());
        }

        boolean[] mark = new boolean[n];

        // Populate indexes with positions of non-'*' characters
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch != '*') {
                indexes.get(ch - 'a').add(i);
            } else {
                mark[i] = true;
                // Find and mark the smallest non-'*' character to the left of '*'
                for (int j = 0; j < 26; j++) {
                    if (indexes.get(j).size() > 0) {
                        List<Integer> AL = indexes.get(j);
                        int le = AL.get(AL.size() - 1);
                        mark[le] = true;
                        AL.remove(AL.size() - 1);
                        break;
                    }
                }
            }
        }

        // Build the resulting string excluding marked characters
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (!mark[i]) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Day26 solution = new Day26();

        // Test cases
        String s1 = "aaba*";
        System.out.println(solution.clearStars(s1)); // Expected: "aab"

        String s2 = "abc";
        System.out.println(solution.clearStars(s2)); // Expected: "abc"

        String s3 = "ab*c*";
        System.out.println(solution.clearStars(s3)); // Expected: "a"

        String s4 = "a*b*c*d*";
        System.out.println(solution.clearStars(s4)); // Expected: ""

        String s5 = "leetcode*";
        System.out.println(solution.clearStars(s5)); // Expected: "letcode"
    }
}
