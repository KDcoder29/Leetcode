class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int n = nums.length;
        int count=0;
        for(int sp=0;sp<n;sp++){
            int ans =0;
            for(int ep = sp;ep<n;ep++){
                ans = gcd(ans,Math.abs(nums[ep]));
                if(ans==k) count++;
                if(ans < k) break;
            }
        }
        return count;
    }
    public static int gcd(int a,int b){
        if(a==0) return b;

        int temp = gcd(b%a,a);
        return temp;
    }
}
