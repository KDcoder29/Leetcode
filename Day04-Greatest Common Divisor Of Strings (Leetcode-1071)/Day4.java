public class Day4 {
    public static void main(String[] args) {
        // Test cases
        String str1 = "ABABAB";
        String str2 = "ABAB";

        // Create a Solution object
        Solution solution = new Solution();

        // Find the GCD of the strings
        String result = solution.gcdOfStrings(str1, str2);

        // Print the result
        System.out.println("The GCD of the strings \"" + str1 + "\" and \"" + str2 + "\" is: \"" + result + "\"");

        // Additional test case
        str1 = "ABCABC";
        str2 = "ABC";
        result = solution.gcdOfStrings(str1, str2);
        System.out.println("The GCD of the strings \"" + str1 + "\" and \"" + str2 + "\" is: \"" + result + "\"");

        str1 = "LEET";
        str2 = "CODE";
        result = solution.gcdOfStrings(str1, str2);
        System.out.println("The GCD of the strings \"" + str1 + "\" and \"" + str2 + "\" is: \"" + result + "\"");
    }
}

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenation of the strings in both orders is the same
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Compute the GCD of the lengths of the two strings
        int length = gcd(str1.length(), str2.length());

        // The GCD string will be the prefix of either str1 or str2 up to the gcd length
        return str1.substring(0, length);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
