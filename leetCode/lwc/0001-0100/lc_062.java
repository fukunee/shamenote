package solution2;

/**
 * @author lwc
 * @date 2019/10/12 9:11
 */
public class U62 {
    public int uniquePaths(int m, int n) {
        int[][] value = new int[m + 1][n + 1];
        value[1][1] = 1;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if(i==1&&j==1) continue;
                value[i][j] = value[i - 1][j] + value[i][j - 1];
            }
        }

        return value[m][n];
    }
}
