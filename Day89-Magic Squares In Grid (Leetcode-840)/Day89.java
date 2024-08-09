class Solution {
    static int counts = 0;

    public static int numMagicSquaresInside(int[][] grid) {
        counts = 0; // we have to Reset counts for each new invocation
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i <= row - 3; i++) {
            for (int j = 0; j <= col - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    counts++;
                }
            }
        }

        return counts;
    }

    public static boolean isMagicSquare(int[][] grid, int rowStart, int colStart) {
        // Check if the numbers are all distinct and within 1-9
        if (!checkUnique(grid, rowStart, colStart)) {
            return false;
        }

        // Calculate the sum of the first row to use as a reference
        int targetSum = grid[rowStart][colStart] + grid[rowStart][colStart + 1] + grid[rowStart][colStart + 2];

        // Check rows
        for (int i = 0; i < 3; i++) {
            int rowSum = grid[rowStart + i][colStart] + grid[rowStart + i][colStart + 1] + grid[rowStart + i][colStart + 2];
            if (rowSum != targetSum) {
                return false;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            int colSum = grid[rowStart][colStart + j] + grid[rowStart + 1][colStart + j] + grid[rowStart + 2][colStart + j];
            if (colSum != targetSum) {
                return false;
            }
        }

        // Check diagonals
        int diag1 = grid[rowStart][colStart] + grid[rowStart + 1][colStart + 1] + grid[rowStart + 2][colStart + 2];
        int diag2 = grid[rowStart][colStart + 2] + grid[rowStart + 1][colStart + 1] + grid[rowStart + 2][colStart];

        return diag1 == targetSum && diag2 == targetSum;
    }

    public static boolean checkUnique(int[][] grid, int rowStart, int colStart) {
        boolean[] seen = new boolean[10];

        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                int num = grid[i][j];
                if (num < 1 || num > 9 || seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }

        return true;
    }
}
