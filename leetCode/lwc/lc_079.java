package solution2;

/**
 * @author lwc
 * @date 2019/10/17 9:58
 */
public class U79 {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || board[0].length == 0 || word.isEmpty()) return false;
        int[][] stackV = new int[word.length()][3];
        int[][] boardV = new int[board.length][board[0].length];


        int p1, x, y, dir;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char c = word.charAt(0);
                if (board[i][j] == c) {
                    if (0 == word.length() - 1) return true;
                    p1 = 0;
                    stackV[p1][0] = i;
                    stackV[p1][1] = j;
                    stackV[p1][2] = 4;
                    boardV[i][j] = 1;
                    while (p1 >= 0) {
                        dir = stackV[p1][2];
                        x = stackV[p1][0];
                        y = stackV[p1][1];

                        if (dir == 0) {
                            p1--;
                            boardV[x][y] = 0;
                            continue;
                        }

                        stackV[p1][2] = dir - 1;

                        if (dir == 4) x = x - 1;
                        if (dir == 3) x = x + 1;
                        if (dir == 2) y = y - 1;
                        if (dir == 1) y = y + 1;


                        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) continue;
                        if (word.charAt(p1 + 1) != board[x][y] || boardV[x][y] == 1) continue;
                        if (p1 + 1 == word.length() - 1) return true;
                        p1++;
                        stackV[p1][0] = x;
                        stackV[p1][1] = y;
                        stackV[p1][2] = 4;
                        boardV[x][y] = 1;
                    }
                }
            }
        }

        return false;
    }

    public void setStackV(int[][] stackV, int p1, int i, int j, int dir) {
        stackV[p1][0] = i;
        stackV[p1][1] = j;
        stackV[p1][2] = dir;
    }
}
