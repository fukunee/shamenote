package leetcode;

/**
 * @author lwc
 * @date 2019/11/18 10:28
 */
public class lc_201 {
    public int rangeBitwiseAnd(int m, int n) {
        int r = (int)(Math.log(n) / Math.log(2));
        int l = (int)(Math.log(m) / Math.log(2));
        if(r != l) return 0;

        int left = (int)Math.pow(2,l);
        for(int i = m; i <= n; i++){
            m = m & i;
            if(m == left) break;
            if(i == Integer.MAX_VALUE) break;
        }

        return m;
    }
}
