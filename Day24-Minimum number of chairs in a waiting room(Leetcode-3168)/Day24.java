import java.util.Scanner;

public class Day24 {
    public int minimumChairs(String s) {
        int sit = 0;
        int chair = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                if (sit == chair) {
                    chair++;
                }
                sit++;
            } else if (s.charAt(i) == 'L') {
                sit--;
            }
        }
        return chair;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string (sequence of 'E' and 'L'): ");
        String s = scanner.nextLine();

        Day24 solution = new Day24();
        int result = solution.minimumChairs(s);
        System.out.println("Minimum number of chairs required: " + result);
    }
}
