public class Day16 {
    public int nextGreaterElement(int n) {
        int idx = -1;
        char[] arr = (n + "").toCharArray();

        // Find the first decreasing element from the end
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }

        // If no such element is found, return -1
        if (idx == -1) {
            return -1;
        }

        // Find the smallest element on the right side of idx that is larger than
        // arr[idx]
        int idx2 = -1;
        for (int i = arr.length - 1; i > idx; i--) {
            if (arr[i] > arr[idx]) {
                idx2 = i;
                break;
            }
        }

        // Swap the elements at idx and idx2
        char temp = arr[idx2];
        arr[idx2] = arr[idx];
        arr[idx] = temp;

        // Reverse the elements after idx to get the next permutation
        int s = idx + 1;
        int e = arr.length - 1;
        while (s < e) {
            char t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            e--;
            s++;
        }

        // Convert the character array back to a number
        long ans = Long.parseLong(new String(arr));

        // Check if the result is within the range of int
        if (ans > Integer.MAX_VALUE) {
            return -1;
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        Day16 sol = new Day16();

        // Test cases
        int test1 = 1234;
        int test2 = 4321;
        int test3 = 534976;

        System.out.println("Next greater element for " + test1 + " is: " + sol.nextGreaterElement(test1)); // Should
                                                                                                           // return
                                                                                                           // 1243
        System.out.println("Next greater element for " + test2 + " is: " + sol.nextGreaterElement(test2)); // Should
                                                                                                           // return -1
        System.out.println("Next greater element for " + test3 + " is: " + sol.nextGreaterElement(test3)); // Should
                                                                                                           // return
                                                                                                           // 536479
    }
}
