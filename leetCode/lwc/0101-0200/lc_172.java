package solution2;

import java.util.HashMap;

/**
 * @author lwc
 * @date 2019/11/14 23:51
 */
public class U172 {
    public int trailingZeroes(int n) {
        int count = 0;
        for(long i = 5; i <= n; i = i * 5){
            count += n / i;
        }
        return count;
    }
}
