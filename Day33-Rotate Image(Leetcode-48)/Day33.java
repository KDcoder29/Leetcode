public class Day {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < rows; i++) {
            int[] p = matrix[i];
            int sp = 0;
            int ep = p.length - 1;
            while (sp < ep) {
                int temp = p[sp];
                p[sp] = p[ep];
                p[ep] = temp;
                ep--;
                sp++;
            }
            matrix[i] = p;
        }
    }

    public static void main(String[] args) {
        Day solution = new Day();

        // Example matrix
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Print original matrix
        System.out.println("Original matrix:");
        printMatrix(matrix);

        // Rotate the matrix
        solution.rotate(matrix);

        // Print rotated matrix
        System.out.println("Rotated matrix:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
