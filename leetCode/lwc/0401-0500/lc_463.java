package leetcode;

/**
 * @author lwc
 * @date 2020/2/9 19:35
 */
public class lc_463 {
    public int islandPerimeter(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0)
            return 0;
        int len = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    int cur = 4;
                    if(i - 1 >= 0 && grid[i-1][j] == 1) cur--;
                    if(i + 1 < grid.length && grid[i+1][j] == 1) cur--;
                    if(j - 1 >= 0 && grid[i][j-1] == 1) cur--;
                    if(j + 1 < grid[0].length && grid[i][j+1] == 1) cur--;
                    len += cur;
                }
            }
        }
        return len;
    }
}
