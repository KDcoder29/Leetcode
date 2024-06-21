class Day40 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int totalSatisfied = 0;
        int maxExtraSatisfied = 0;
        int currentExtraSatisfied = 0;

        // Calculate initially satisfied customers and extra satisfied customers within
        // the first "minutes" interval.
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                totalSatisfied += customers[i];
            } else if (i < minutes) {
                currentExtraSatisfied += customers[i];
            }
        }

        maxExtraSatisfied = currentExtraSatisfied;

        // Use sliding window to find the maximum extra satisfied customers.
        for (int i = minutes; i < n; i++) {
            if (grumpy[i] == 1) {
                currentExtraSatisfied += customers[i];
            }
            if (grumpy[i - minutes] == 1) {
                currentExtraSatisfied -= customers[i - minutes];
            }
            maxExtraSatisfied = Math.max(maxExtraSatisfied, currentExtraSatisfied);
        }

        return totalSatisfied + maxExtraSatisfied;
    }

    public static void main(String[] args) {
        Day40 solution = new Day40();

        // Example 1
        int[] customers1 = { 1, 0, 1, 2, 1, 1, 7, 5 };
        int[] grumpy1 = { 0, 1, 0, 1, 0, 1, 0, 1 };
        int minutes1 = 3;
        System.out.println("Example 1 Output: " + solution.maxSatisfied(customers1, grumpy1, minutes1)); // Expected: 16

        // Example 2
        int[] customers2 = { 1 };
        int[] grumpy2 = { 0 };
        int minutes2 = 1;
        System.out.println("Example 2 Output: " + solution.maxSatisfied(customers2, grumpy2, minutes2)); // Expected: 1
    }
}
