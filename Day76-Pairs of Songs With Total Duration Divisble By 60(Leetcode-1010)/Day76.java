class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        long[] arr = new long[60];
        for (int i = 0; i < time.length; i++) {
            int idx = time[i] % 60;
            arr[idx] = arr[idx] + 1;
        }

        long ans = 0;

        for (int i = 1; i < 30; i++) {
            ans = ans + arr[i] * arr[60 - i];
        }

         long contri1 = (arr[0] * (arr[0] - 1)) / 2;
        ans = ans + contri1;

        long contri2 = (arr[30] * (arr[30] - 1)) / 2;
        ans = ans + contri2;

        return (int)ans;
    }
}
