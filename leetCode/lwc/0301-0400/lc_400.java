package leetcode;

/**
 * @author lwc
 * @date 2019/12/21 23:00
 */
public class lc_400 {
    public int findNthDigit(int n) {
        int m = 10; int i = 1, j = 1;
        while(n > 0){
            if (i >= m) {
                m = m * 10;
                j = j + 1;
            }
            n = n - j;
            i++;
        }
        String str = String.valueOf(i - 1);
        return str.charAt(str.length() + n - 1) - '0';
    }
}
