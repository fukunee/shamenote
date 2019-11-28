package leetcode;

/**
 * @author lwc
 * @date 2019/11/25 9:52
 */
public class lc_231 {
    public boolean isPowerOfTwo(int n) {
        while(n > 1){
            if(n % 2 == 0) n = n / 2;
            else break;
        }
        return n == 1;
    }
}
