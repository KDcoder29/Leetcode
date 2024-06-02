public class Day22 {
    public int[] replaceElements(int[] arr) {
        int[] compare = new int[arr.length];
        int maxTillNow = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > maxTillNow) {
                maxTillNow = arr[i];
            } 
            compare[i] = maxTillNow;
        }

        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length - 1; i++) {
            ans[i] = compare[i + 1];
        }
        ans[ans.length - 1] = -1;
        return ans;
    }

    public static void main(String[] args) {
        Day22 solution = new Day22();
        int[] input = { 17, 18, 5, 4, 6, 1 };
        int[] result = solution.replaceElements(input);

        System.out.print("Replaced elements: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
