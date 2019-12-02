package leetcode;

/**
 * @author lwc
 * @date 2019/11/28 10:32
 */
public class lc_304 {
    class NumMatrix {

        int[][] v;

        public NumMatrix(int[][] matrix) {
            if(matrix.length > 0) {
                v = new int[matrix.length + 1][matrix[0].length + 1];
                for (int i = matrix.length - 1; i >= 0; i--) {
                    for (int j = matrix[0].length - 1; j >= 0; j--) {
                        v[i][j] = v[i + 1][j] + v[i][j + 1] - v[i + 1][j + 1] + matrix[i][j];
                    }
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return v[row1][col1] - v[row1][col2+1] - v[row2 + 1][col1] + v[row2+1][col2+1];
        }
    }

}
