import java.util.ArrayList;
import java.util.List;

public class Day19 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        int i = 0;
        int j = 0;
        int rsteps = row - 1;
        int csteps = col - 1;

        while (rsteps >= 1 && csteps >= 1) {
            for (int k = 0; k < csteps; k++) {
                ans.add(matrix[i][j]);
                j++;
            }

            for (int k = 0; k < rsteps; k++) {
                ans.add(matrix[i][j]);
                i++;
            }

            for (int k = csteps; k >= 1; k--) {
                ans.add(matrix[i][j]);
                j--;
            }

            for (int k = rsteps; k >= 1; k--) {
                ans.add(matrix[i][j]);
                i--;
            }

            rsteps -= 2;
            csteps -= 2;
            i++;
            j++;
        }

        if (rsteps == 0) {
            for (int k = 0; k < csteps + 1; k++) {
                ans.add(matrix[i][j]);
                j++;
            }
        } else if (csteps == 0) {
            for (int k = 0; k < rsteps + 1; k++) {
                ans.add(matrix[i][j]);
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Day19 solution = new Day19();
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        List<Integer> result = solution.spiralOrder(matrix);
        System.out.println(result); // Should print [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
