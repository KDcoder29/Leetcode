public class Day8 {
    public static void main(String[] args) {
        Day8 main = new Day8();

        // Test case 1
        char[] chars1 = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int length1 = main.compress(chars1);
        System.out.print("Output for chars1: ");
        for (int i = 0; i < length1; i++) {
            System.out.print(chars1[i]);
        }
        System.out.println("\nExpected: a2b2c3");

        // Test case 2
        char[] chars2 = { 'a' };
        int length2 = main.compress(chars2);
        System.out.print("Output for chars2: ");
        for (int i = 0; i < length2; i++) {
            System.out.print(chars2[i]);
        }
        System.out.println("\nExpected: a");

        // Test case 3
        char[] chars3 = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        int length3 = main.compress(chars3);
        System.out.print("Output for chars3: ");
        for (int i = 0; i < length3; i++) {
            System.out.print(chars3[i]);
        }
        System.out.println("\nExpected: ab12");
    }

    public int compress(char[] chars) {
        int i = 0;
        int index = 0;

        while (i < chars.length) {
            char currchar = chars[i];
            int count = 0;

            // Count the occurrences of the current character
            while (i < chars.length && chars[i] == currchar) {
                i++;
                count++;
            }

            // Store the character
            chars[index++] = currchar;

            // Store the count if it's greater than 1
            if (count > 1) {
                String countstr = Integer.toString(count);
                for (int j = 0; j < countstr.length(); j++) {
                    chars[index++] = countstr.charAt(j);
                }
            }
        }
        return index;
    }
}
