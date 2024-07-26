class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][m];
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                        dp[i][j][k] = Integer.MIN_VALUE;
                }
            }
        }
        int ans = countPaths(m-1,n-1,m-1,n-1,grid,dp);
        return Math.max(0, ans);
    }
    public int countPaths(int row1,int col1, int row2, int col2, int[][] grid,int[][][] dp){
        col2=row1+col1-row2;
        if (row1 < 0 || col1 < 0 || row2 < 0 || col2 < 0 || grid[row1][col1] == -1 || grid[row2][col2] == -1) {
            return Integer.MIN_VALUE;
        }
        if (row1 == 0 && col1 == 0 && row2 == 0 && col2 == 0) {
            return grid[0][0];
        }
        if (dp[row1][col1][row2] != Integer.MIN_VALUE) {
            return dp[row1][col1][row2];
        }
        int x = countPaths(row1 - 1, col1, row2 - 1, col2, grid, dp);
        int y = countPaths(row1, col1 - 1, row2, col2 - 1, grid, dp);
        int z = countPaths(row1 - 1, col1, row2, col2 - 1, grid, dp);
        int w = countPaths(row1, col1 - 1, row2 - 1, col2, grid, dp);

        int max = Math.max(Math.max(x, y), Math.max(w, z));
     
        int contri = (row1 == row2 && col1 == col2) ? grid[row1][col1] : grid[row1][col1] + grid[row2][col2];
        dp[row1][col1][row2]=max+contri;
        return max+contri;
    }
}
