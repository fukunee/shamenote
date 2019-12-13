package leetcode;

/**
 * @author lwc
 * @date 2019/12/5 21:35
 */
public class lc_326 {
    public boolean isPowerOfThree(int n) {
        int last = 0;
        while(n != 1){
            last = n % 10;
            if((last == 1 || last == 3 || last == 7 || last == 9) && n % 3 == 0)
                n = n / 3;
            else return false;
        }
        return true;
    }
}
