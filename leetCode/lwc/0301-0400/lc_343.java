package leetcode;

/**
 * @author lwc
 * @date 2019/12/9 16:14
 */
public class lc_343 {
    public int integerBreak(int n) {
        if(n <= 3) return n - 1;
        int res = 0;
        for(int i = 2; i <= n / 2; i++){
            res = Math.max(res, help(n, i));
        }
        return res;
    }

    public int help(int n, int m){
        int i = n / m;
        int j = n - i * m;
        int k = n - (i - 1) * m;
        return Math.max((int)Math.pow(m, i) * j, (int)Math.pow(m, i - 1) * k);
    }

}
