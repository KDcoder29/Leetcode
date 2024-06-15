public class Day35 {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            reverse(0, index, arr);
        }

        String ans = new String(arr);
        return ans;
    }

    public static void reverse(int s, int e, char[] arr) {
        while (s < e) {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        Day35 solution = new Day35();

        // Test case 1
        String word1 = "abcdefg";
        char ch1 = 'd';
        String result1 = solution.reversePrefix(word1, ch1);
        System.out.println("Original: " + word1 + ", Char: " + ch1 + ", Result: " + result1);
        // Expected: "dcbaefg"

        // Test case 2
        String word2 = "xyzabc";
        char ch2 = 'a';
        String result2 = solution.reversePrefix(word2, ch2);
        System.out.println("Original: " + word2 + ", Char: " + ch2 + ", Result: " + result2);
        // Expected: "cbazyx"

        // Test case 3
        String word3 = "hello";
        char ch3 = 'l';
        String result3 = solution.reversePrefix(word3, ch3);
        System.out.println("Original: " + word3 + ", Char: " + ch3 + ", Result: " + result3);
        // Expected: "lleho"

        // Test case 4
        String word4 = "openai";
        char ch4 = 'x';
        String result4 = solution.reversePrefix(word4, ch4);
        System.out.println("Original: " + word4 + ", Char: " + ch4 + ", Result: " + result4);
        // Expected: "openai" (no change since 'x' is not found)
    }
}
