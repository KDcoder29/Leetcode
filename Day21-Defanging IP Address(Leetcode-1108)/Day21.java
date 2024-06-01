public class Day21 {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder(address);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '.') {
                sb.insert(i, '[');
                sb.insert(i + 2, ']');
                i = i + 2; // Skip the inserted characters
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Day21 solution = new Day21();

        String address = "192.168.0.1";
        String defangedAddress = solution.defangIPaddr(address);

        System.out.println(defangedAddress); // Output: "192[.]168[.]0[.]1"
    }
}
