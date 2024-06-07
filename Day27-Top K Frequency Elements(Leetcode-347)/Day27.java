import java.util.*;

class Day27 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Fill the HashMap with the frequencies of each number
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int temp = hm.get(nums[i]);
                hm.put(nums[i], temp + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }

        // Convert the HashMap to an array of int[] pairs
        int[][] arr = new int[hm.size()][2];
        int j = 0;

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            arr[j][0] = entry.getValue(); // Store the frequency
            arr[j][1] = entry.getKey();   // Store the number
            j++;
        }

        // Sort the array by frequency in descending order
        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));

        // Create the result array with the top k frequent elements
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i][1]; // Take the element with one of the top k highest frequencies
        }

        return ans;
    }

    public static void main(String[] args) {
        Day27 solution = new Day27();

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = solution.topKFrequent(nums, k);

        System.out.println("The top " + k + " frequent elements are: " + Arrays.toString(result));
    }
}
