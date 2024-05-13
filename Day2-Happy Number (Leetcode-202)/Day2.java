import java.util.HashSet;

public class Day2 {
    public boolean isHappy(int n) {
        int temp = n;
        HashSet<Integer> hs = new HashSet<>();
        while (n != 1 && !hs.contains(n)) {
            hs.add(n);
            n = FoundNumber(n);
        }
        return n == 1;
    }

    public static int FoundNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += temp * temp;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Day2 solution = new Day2();
        // Test cases
        System.out.println(solution.isHappy(19)); // Output: true
        System.out.println(solution.isHappy(2)); // Output: false
    }
}
