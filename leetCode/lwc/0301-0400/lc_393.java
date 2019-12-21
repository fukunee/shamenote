package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lwc
 * @date 2019/12/20 15:24
 */
public class lc_393 {
    public boolean validUtf8(int[] data) {
        int k = 0;
        for(int value : data) {
            int i = getUtf(value);
            if(i > 4) return false;
            if(i == 0){
                if(k > 0) return false;
            }
            if(i == 1) {
                if(k == 0) return false;
                else k--;
            }
            if(i > 1){
                if(k > 0) return false;
                else k = i - 1;
            }
        }
        return k == 0;
    }

    public int getUtf(int n){
        int m = 0;
        for(int i = 7; i >= 0; i--){
            m = n % 2 == 0 ? 0 : m + 1;
            n >>>= 1;
        }
        return m;
    }
}
