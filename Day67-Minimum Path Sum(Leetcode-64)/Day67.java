class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        int ans = path(grid,m-1,n-1,dp);
        return ans;
    }
    public int path(int[][] arr,int m, int n,int[][] dp){
        if(m<0 || n<0) return Integer.MAX_VALUE;
        if(m==0 && n==0) return arr[m][n];
        if(dp[m][n]!=0) return dp[m][n];

        int x = path(arr,m-1,n,dp);
        int y = path(arr,m,n-1,dp);

        int add = Math.min(x,y);

        dp[m][n]=arr[m][n]+add;
        return arr[m][n]+add;
        
    }
}
