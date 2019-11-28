package leetcode;

/**
 * @author lwc
 * @date 2019/11/26 20:10
 */
public class lc_258 {
    public int addDigits(int num) {
        if(num < 10) return num;
        int value = 0;
        while(num != 0){
            value += num % 10;
            num = num / 10;
        }
        return addDigits(value);
    }
}
