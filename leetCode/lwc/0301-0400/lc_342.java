package leetcode;

/**
 * @author lwc
 * @date 2019/12/9 15:20
 */
public class lc_342 {
    public boolean isPowerOfFour(int num) {
        if(num == 0) return false;
        while(num != 1){
            if((num & 3) == 0) num >>>= 2;
            else return false;
        }
        return num == 1;
    }
}
