package leetcode;

import java.util.Arrays;

/**
 * @author lwc
 * @date 2019/12/12 16:20
 */
public class lc_372 {

    int c = 1337;
    public int superPow(int a, int[] b) {
        a %= c;
        int res = 1;
        for(int i = 0; i < b.length; i++)
            res = pow(res, 10) * pow(a, b[i]) % c;
        return res;
    }

    public int pow(int a, int n){
        if(n == 0) return 1;
        int v = pow(a, n / 2);
        if(n % 2 == 0) return v * v % c;
        else return v * v % c * a % c;
    }
}
