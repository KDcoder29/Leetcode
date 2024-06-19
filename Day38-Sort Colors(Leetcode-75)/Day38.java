class Day38 {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 }; // Example array
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void sortColors(int[] nums) {
        int s = 0;
        int m = 0;
        int e = nums.length - 1;
        while (m <= e) {
            if (nums[m] == 2) {
                int temp = nums[m];
                nums[m] = nums[e];
                nums[e] = temp;
                e--; // Decrement only e
            } else if (nums[m] == 0) {
                int temp = nums[m];
                nums[m] = nums[s];
                nums[s] = temp;
                s++;
                m++;
            } else {
                m++;
            }
        }
    }
}
