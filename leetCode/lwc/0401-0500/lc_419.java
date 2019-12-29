package leetcode;

/**
 * @author lwc
 * @date 2019/12/26 10:38
 */
public class lc_419 {
    public int countBattleships(char[][] board) {
        if(board.length == 0 || board[0].length == 0) {
            return 0;
        }
        int x = board.length, y = board[0].length;
        int res = 0;
        int[][] v = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(v[i][j] == 0 && board[i][j] == 'X'){
                    v[i][j] = 1; res += 1;
                    if(j + 1 < y && board[i][j+1] == 'X'){
                        int k = j + 1;
                        while(k < y && board[i][k] == 'X'){
                            v[i][k++] = 1;
                        }
                    }
                    if(i + 1 < x && board[i+1][j] == 'X'){
                        int k = i + 1;
                        while(k < x && board[k][j] == 'X'){
                            v[k++][j] = 1;
                        }
                    }
                }
            }
        }
        return res;
    }
}
