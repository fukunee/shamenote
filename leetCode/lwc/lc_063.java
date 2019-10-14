package solution2;

/**
 * @author lwc
 * @date 2019/10/12 9:36
 */
public class U63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1) return 0;

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] value = new int[m + 1][n + 1];
        value[1][1] = 1;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if(i==1&&j==1) continue;
                if(obstacleGrid[i-1][j-1] == 1)
                    value[i][j] = 0;
                else
                    value[i][j] = value[i - 1][j] + value[i][j - 1];
            }
        }
        return value[m][n];
    }
}
