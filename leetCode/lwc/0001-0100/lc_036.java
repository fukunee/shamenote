package solution2;

import java.util.HashMap;

public class U36 {
    public boolean isValidSudoku(char[][] board) {
        char[][] boardR = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boardR[j][i] = board[i][j];
            }
        }

        //1.按行查看有没有重复数字
        for (int i = 0; i < 9; i++) {
            if(isRepeat(board[i]) == false) return false;
        }
        //2.按列查看有没有重复数字
        for (int i = 0; i < 9; i++) {
            if(isRepeat(boardR[i]) == false) return false;
        }
        //3.按阵查看有没有重复数字
        int m = 0, n = 0;
        while (m <= 6) {

            //方阵的9个char
            int k = 0;
            char[] input = new char[9];

            for (int i = m; i < m + 3; i++) {
                for (int j = n; j < n + 3; j++) {
                    input[k++] = board[i][j];
                }
            }
            if(isRepeat(input)== false) return false;
            n = n + 3;


            if(m <= 6 && n > 6){
                m = m+3;
                n = 0;
            }
        }

        return true;
    }


    /**
     * 该方法用来判断按行，列，阵是否含有重复数字
     *
     * @input int[]
     * @output boolean
     */
    public boolean isRepeat(char[] input) {
        HashMap<Character, Integer> check = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            char value = input[i];
            if(value == '.') continue;
            if (check.containsKey(value)) return false;
            else check.put(value, 1);
        }
        return true;
    }



}
