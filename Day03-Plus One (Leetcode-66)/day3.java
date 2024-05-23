public class day3 {
    public static void main(String[] args) {
        int[] digits1 = { 1, 2, 3 };
        int[] digits2 = { 4, 3, 2, 1 };
        int[] digits3 = { 8, 9, 9, 9 };

        day3 solution = new day3();

        int[] result1 = solution.plusOne(digits1);
        int[] result2 = solution.plusOne(digits2);
        int[] result3 = solution.plusOne(digits3);

        System.out.println("Result 1: " + java.util.Arrays.toString(result1));
        System.out.println("Result 2: " + java.util.Arrays.toString(result2));
        System.out.println("Result 3: " + java.util.Arrays.toString(result3));
    }

    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0 && digits[i] == 9) {
            i--;
        }
        int[] ans = new int[digits.length + 1];
        if (i == -1) {
            ans[0] = 1;
            return ans;
        } else {
            digits[i]++;
            for (int j = i + 1; j < digits.length; j++) {
                digits[j] = 0;
            }
            return digits;
        }
    }
}
