package solution2;

/**
 * @author lwc
 * @date 2019/10/16 16:21
 */
public class U74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int x = matrix.length;
        int y = matrix[0].length;
        if (target < matrix[0][0] || target > matrix[x - 1][y - 1]) return false;
        for (int i = 0; i < x; i++) {
            if (target > matrix[i][y - 1]) continue;
            int l = 0;
            int r = y - 1;
            while (l <= r) {
                int m = (l + r) / 2;
                if (target == matrix[i][m]) return true;
                if (target > matrix[i][m]) l = m + 1;
                if (target < matrix[i][m]) r = m - 1;
            }
            break;
        }
        return false;
    }
}
