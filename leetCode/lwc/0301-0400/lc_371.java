package leetcode;

/**
 * @author lwc
 * @date 2019/12/12 16:11
 */
public class lc_371 {
    public int getSum(int a, int b) {
        int c = a ^ b;
        b = a & b;
        return b == 0 ? c : getSum(c, b << 1);
    }
}
