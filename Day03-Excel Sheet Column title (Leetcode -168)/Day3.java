public class Main {
    public static void main(String[] args) {
        // Test cases
        System.out.println(convertToTitle(1));   // Output: "A"
        System.out.println(convertToTitle(28));  // Output: "AB"
        System.out.println(convertToTitle(701)); // Output: "ZY"
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26; // Adjust to handle cases like 'Z'
            char ch = (char) ('A' + remainder);
            sb.insert(0, ch);
            columnNumber = (columnNumber - 1) / 26;
        }

        return sb.toString();
    }
}
