package leetcode;

/**
 * @author lwc
 * @date 2019/11/26 20:43
 */
public class lc_263 {
    public boolean isUgly(int num) {
        if(num == 0) return false;
        while(num != 1){
            if(num % 2 == 0) num = num / 2;
            else if(num % 3 == 0) num = num / 3;
            else if(num % 5 == 0) num = num / 5;
            else return false;
        }
        return true;
    }
}
