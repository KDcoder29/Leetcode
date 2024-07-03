class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4) return 0;
         int minDiff=Integer.MAX_VALUE;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<4;i++){
            int diff = nums[n-1-3+i]-nums[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
}
