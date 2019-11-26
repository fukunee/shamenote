package leetcode;

import javafx.util.Pair;
import java.util.LinkedList;

/**
 * @author lwc
 * @date 2019/11/18 9:13
 */
public class lc_200 {
    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int xLen = grid.length, yLen = grid[0].length;
        int count = 0;
        for(int i = 0; i < xLen; i++){
            for(int j = 0; j < yLen; j++){
                if(grid[i][j] == '1'){
                    count++;
                    grid[i][j] = '0';
                    LinkedList<Integer> queue = new LinkedList<>();
                    queue.push(i * yLen + j);
                    while(!queue.isEmpty()){
                        int value = queue.pop();
                        int x = value / yLen;
                        int y = value % yLen;
                        if(x - 1 >= 0 && grid[x-1][y] == '1'){
                            grid[x-1][y] = '0';
                            queue.push((x-1)*yLen+y);
                        }
                        if(x + 1 < xLen && grid[x+1][y] == '1'){
                            grid[x+1][y] = '0';
                            queue.push((x+1)*yLen+y);
                        }
                        if(y - 1 >= 0 && grid[x][y-1] == '1'){
                            grid[x][y-1] = '0';
                            queue.push(x*yLen+(y-1));
                        }
                        if(y + 1 < yLen && grid[x][y+1] == '1'){
                            grid[x][y+1] = '0';
                            queue.push(x*yLen+(y+1));
                        }
                    }
                }
            }
        }
        return count;
    }
}
