public class Day30 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Day30 solution = new Day30();

        int[] arr1 = { 4, 5, 8 };
        int[] arr2 = { 10, 9, 1, 8 };
        int d = 2;

        int result = solution.findTheDistanceValue(arr1, arr2, d);
        System.out.println("The distance value is: " + result);
    }
}
