package leetcode;

/**
 * @author lwc
 * @date 2019/11/27 17:01
 */
public class lc_289 {
    public void gameOfLife(int[][] board) {
        if(board.length == 0 || board[0].length == 0)
            return ;
        int x = board.length;
        int y = board[0].length;
        int[][] clone = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                int count = getNum(board,i,j);

                if(board[i][j] == 1){
                    if(count >= 2 && count <= 3)
                        clone[i][j] = 1;
                }
                else{
                    if(count == 3) clone[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++) {
                board[i][j] = clone[i][j];
            }
        }
    }

    public int getNum(int[][] clone, int x, int y){
        int count = 0;
        int len = clone.length;
        int wid = clone[0].length;

        if(x - 1 >= 0 && clone[x-1][y] == 1)
            count++;
        if(x + 1 < len && clone[x+1][y] == 1)
            count++;
        if(y - 1 >= 0 && clone[x][y-1] == 1)
            count++;
        if(y + 1 < wid && clone[x][y+1] == 1)
            count++;

        if(x - 1 >= 0 && y - 1 >= 0 && clone[x-1][y-1] == 1)
            count++;
        if(x - 1 >= 0 && y + 1 < wid && clone[x-1][y+1] == 1)
            count++;
        if(x + 1 < len && y - 1 >= 0 && clone[x+1][y-1] == 1)
            count++;
        if(x + 1 < len && y + 1 < wid && clone[x+1][y+1] == 1)
            count++;

        return count;
    }
}
