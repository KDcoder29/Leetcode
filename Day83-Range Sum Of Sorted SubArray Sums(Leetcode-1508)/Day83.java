class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] arr = new int[n*(n+1)/2];
        int fill=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum =0;
                for(int k=i;k<=j;k++){
                    sum=sum+nums[k];
                }
                arr[fill]=sum;
                fill++;
            }
        }
    Arrays.sort(arr);
    int ans =0;
    for(int i=left-1;i<right;i++){
        ans=ans+arr[i];
        ans=ans%1000000007;
    }
    return ans;
    }
}
