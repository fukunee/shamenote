package solution2;

/**
 * @author lwc
 * @date 2019/10/12 10:00
 */
public class U64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int i = 1; int j = 1;
        while(j < n) grid[0][j] = grid[0][j-1] + grid[0][j++];
        while(i < m) grid[i][0] = grid[i-1][0] + grid[i++][0];
        for(i = 1; i < m; i++){
            for(j = 1; j < n; j++){
                grid[i][j] = Math.min(grid[i][j-1],grid[i-1][j]) + grid[i][j];
            }
        }
        return grid[m-1][n-1];
    }
}
