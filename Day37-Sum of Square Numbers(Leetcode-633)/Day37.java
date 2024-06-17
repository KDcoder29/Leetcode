class Day37 {
    public boolean judgeSquareSum(int c) {
        if (c < 0) {
            return false;
        }

        long left = 0;
        long right = (long) Math.sqrt(c);

        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Day37 solution = new Day37();

        // Test cases
        int[] testCases = { 0, 1, 2, 3, 4, 5, 2147483600 };
        for (int c : testCases) {
            boolean result = solution.judgeSquareSum(c);
            System.out.println("Can " + c + " be expressed as the sum of two squares? " + result);
        }
    }
}
