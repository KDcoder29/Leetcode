public class Day6 {
    public String reverseWords(String s) {
        int lpointer = s.length() - 1;
        int spointer = 0;
        String ans = "";
        String word = "";

        // Trim trailing spaces
        while (lpointer >= 0 && s.charAt(lpointer) == ' ') {
            lpointer--;
        }

        // Trim leading spaces
        while (spointer < s.length() && s.charAt(spointer) == ' ') {
            spointer++;
        }

        int space = 0;
        for (int i = lpointer; i >= spointer; i--) {
            if (s.charAt(i) != ' ') {
                space = 0;
            }
            if (s.charAt(i) == ' ' && space == 0) {
                space = 1;
                ans = " " + word + ans; // Add the word and space to the answer
                word = "";
                continue;
            }
            if (s.charAt(i) != ' ') {
                word = s.charAt(i) + word;
            }
        }

        ans = word + ans; // Add the last word

        return ans.trim(); // Trim any leading or trailing spaces in the final result
    }

    public static void main(String[] args) {
        Day6 solution = new Day6();
        String s = "the sky is blue";
        String result = solution.reverseWords(s);
        System.out.println(result); // Output: "blue is sky the"
    }
}
