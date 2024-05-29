public class Day18 {

    public int maxChunksToSorted(int[] arr) {
        int[] prefixmax = new int[arr.length];
        int[] suffixmin = new int[arr.length];

        // Compute the prefix max array
        prefixmax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixmax[i] = Math.max(arr[i], prefixmax[i - 1]);
        }

        // Compute the suffix min array
        suffixmin[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            suffixmin[i] = Math.min(arr[i], suffixmin[i + 1]);
        }

        // Count the number of chunks
        int chunks = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (prefixmax[i] <= suffixmin[i + 1]) {
                chunks++;
            }
        }
        return chunks + 1;
    }

    public static void main(String[] args) {
        Day18 solution = new Day18();

        // Test case
        int[] arr = { 2, 1, 3, 4, 4 };

        int result = solution.maxChunksToSorted(arr);
        System.out.println("Maximum number of chunks: " + result);

        // Additional test cases
        int[] arr1 = { 4, 3, 2, 1, 0 };
        System.out.println("Maximum number of chunks: " + solution.maxChunksToSorted(arr1)); // Expected output: 1

        int[] arr2 = { 1, 0, 2, 3, 4 };
        System.out.println("Maximum number of chunks: " + solution.maxChunksToSorted(arr2)); // Expected output: 4

        int[] arr3 = { 1, 2, 0, 3, 4 };
        System.out.println("Maximum number of chunks: " + solution.maxChunksToSorted(arr3)); // Expected output: 3
    }
}
