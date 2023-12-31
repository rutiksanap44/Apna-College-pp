// package 2D Arrays;

public class spiral_matrix {
    public static void printSpiral(int[][] matrix) {
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        int startRow = 0;
        int endRow = matrix.length - 1;

        while (startCol <= endCol && startRow <= endRow) {
            // top boundary
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right boundary
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom boundary
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String1[] args) {
        int[][] matrix = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 1 },
                { 2, 3, 4, 5, 6 } };
        printSpiral(matrix);
    }
}
