package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author lwc
 * @date 2019/12/11 16:41
 */
public class lc_365 {
    public boolean canMeasureWater(int x, int y, int z) {
        //此题求最大公约数
        if(z > x + y) return false;
        if(z == 0 || z == x || z == y) return true;
        if(x < y){
            int temp = x;
            x = y;
            y = temp;
        }
        if(y > 0){
            int r = x % y;
            while(r > 0){
                x = y;
                y = r;
                r = x % y;
            }
            return z % y == 0;
        }
        return z % x == 0;
    }

}
