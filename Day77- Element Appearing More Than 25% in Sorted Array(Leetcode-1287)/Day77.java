class Solution {
    public int findSpecialInteger(int[] arr) {
        int fourth = arr.length / 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + fourth]) {
                return arr[i];
            }
        }
        return 0;
    }
}
