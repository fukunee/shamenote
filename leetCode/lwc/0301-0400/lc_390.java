package leetcode;

import java.util.LinkedList;

/**
 * @author lwc
 * @date 2019/12/20 10:34
 */
public class lc_390 {
    public int lastRemaining(int n) {
        return n == 1 ? 1 : 2 * (n/2 - lastRemaining(n / 2) + 1);
    }
}
