import java.util.Arrays;
import java.util.HashMap;

public class Day20 {
    public int[] arrayRankTransform(int[] arr) {
        int[] original = arr.clone();
        HashMap<Integer, Integer> hm = new HashMap<>();
        Arrays.sort(arr);
        int rank = 1;
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                continue;
            } else {
                hm.put(arr[i], rank);
                rank++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            original[i] = hm.get(original[i]);
        }
        return original;
    }

    public static void main(String[] args) {
        Day20 solution = new Day20();
        int[] arr = { 40, 10, 20, 30 };
        int[] result = solution.arrayRankTransform(arr);
        System.out.println(Arrays.toString(result)); // Output: [4, 1, 2, 3]
    }
}
