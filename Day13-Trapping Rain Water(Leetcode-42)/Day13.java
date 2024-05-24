import java.util.Scanner;

public class Day13 {
    public int trap(int[] height) {
        int[] pmax = new int[height.length];
        int[] smax = new int[height.length];

        pmax[0] = height[0];
        smax[height.length - 1] = height[height.length - 1];

        for (int i = 1; i < height.length; i++) {
            if (height[i] > pmax[i - 1]) {
                pmax[i] = height[i];
            } else {
                pmax[i] = pmax[i - 1];
            }
        }

        for (int i = height.length - 2; i >= 0; i--) {
            if (height[i] > smax[i + 1]) {
                smax[i] = height[i];
            } else {
                smax[i] = smax[i + 1];
            }
        }

        int amount = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(pmax[i], smax[i]);
            int add = min - height[i];
            if (add > 0) {
                amount += add;
            }
        }

        return amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the height array:");
        int n = scanner.nextInt();
        int[] height = new int[n];

        System.out.println("Enter the elements of the height array:");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        Day13 solution = new Day13();
        int result = solution.trap(height);

        System.out.println("The amount of trapped water is: " + result);
    }
}
