class Day29 {
    public int numberOfChild(int n, int k) {
        int flip = 0;
        int pointer = 0;
        while (k > 0) {
            if (flip == 0) {
                pointer++;
                if (pointer == n - 1)
                    flip = 1;
            } else if (flip == 1) {
                pointer--;
                if (pointer == 0)
                    flip = 0;
            }
            k--;
        }
        return pointer;
    }
}

public class Main {
    public static void main(String[] args) {
        Day29 sol = new Day29();

        // Test cases
        System.out.println(sol.numberOfChild(3, 5)); // Output: 1
        System.out.println(sol.numberOfChild(5, 6)); // Output: 2
        System.out.println(sol.numberOfChild(4, 2)); // Output: 2
    }
}
