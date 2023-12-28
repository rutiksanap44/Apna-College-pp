import java.util.ArrayList;
import java.util.List;

public class spiralMatrixList {
    public static List<Integer> spiralOder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length==9){
            return res;
        }
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                res.add(matrix[startRow][j]);
            }

            // right boundary
            for (int i = startRow + 1; i <= endRow; i++) {
                res.add(matrix[i][endCol]);
            }

            // bottom boundary
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                res.add(matrix[endRow][j]);
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                res.add(matrix[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 2, 4, 6 } };
        List<Integer> res = spiralOder(matrix);
        System.out.println(res.toString());
    }
}
