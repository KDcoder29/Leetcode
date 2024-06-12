public class Day32 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int skip = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = skip; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    count++;
                    skip = j + 1;
                    break;
                }
            }
        }
        return count == s.length();
    }

    public static void main(String[] args) {
        Day32 solution = new Day32();

        // Example test cases
        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println("Is \"" + s1 + "\" a subsequence of \"" + t1 + "\"? " + solution.isSubsequence(s1, t1));

        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println("Is \"" + s2 + "\" a subsequence of \"" + t2 + "\"? " + solution.isSubsequence(s2, t2));
    }
}
