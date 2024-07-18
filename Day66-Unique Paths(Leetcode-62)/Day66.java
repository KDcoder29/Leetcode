class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        int ans = paths(m-1,n-1,dp);
        return ans;
    }
    public int paths(int m,int n,int[][] dp){
        if(m==0 || n==0) return 1;
        if(dp[m][n]!=0) return dp[m][n];

        int x = paths(m,n-1,dp);
        int y = paths(m-1,n,dp);

        dp[m][n]=x+y;
        return x+y;
    }
}
