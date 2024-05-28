public class Day17 {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0;
        int maxTillNow = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            maxTillNow = Math.max(maxTillNow, arr[i]);
            if (maxTillNow == i) {
                chunks++;
            }
        }
        return chunks;
    }

    public static void main(String[] args) {
        Day17 solution = new Day17();

        int[] arr1 = { 4, 3, 2, 1, 0 };
        int result1 = solution.maxChunksToSorted(arr1);
        System.out.println("Input: [4, 3, 2, 1, 0]");
        System.out.println("Output: " + result1); // Expected output: 1

        int[] arr2 = { 1, 0, 2, 3, 4 };
        int result2 = solution.maxChunksToSorted(arr2);
        System.out.println("Input: [1, 0, 2, 3, 4]");
        System.out.println("Output: " + result2); // Expected output: 4
    }
}
