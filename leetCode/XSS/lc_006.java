public class lc_006 {
    public static void main(String[] args) {
        System.out.println(new Solution().convert("LEETCODEISHIRING", 3));
    }

    static class Solution {
        public String convert(String s, int numRows) {
            int n = s.length();
            if (n == 0 || numRows <= 1) return s;
            int zcol = numRows - 1;
            int znum = 2 * numRows - 2;
            int row = numRows;
            int col = n / znum * zcol + zcol;
            Character[][] cs = new Character[row][col];
            int index = 0;
            int ncol = -1;
            while (index < n) {
                ++ncol;
                for (int i = 0; i < row; i++) {
                    if (index < n) {
                        cs[i][ncol] = s.charAt(index++);
                    } else {
                        break;
                    }
                }
                for (int i = row - 1 - 1; i > 0; i--) {
                    if (index < n) {
                        cs[i][++ncol] = s.charAt(index++);
                    } else {
                        break;
                    }
                }
            }
            String res = "";
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (cs[i][j] == null) {

                    } else {
                        res += cs[i][j];
                    }
                }
            }
            return res;
        }
    }
}