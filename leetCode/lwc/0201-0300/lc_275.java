package leetcode;

import java.util.Arrays;

/**
 * @author lwc
 * @date 2019/11/27 9:53
 */
public class lc_275 {
    public int hIndex(int[] citations) {
        int h = 0,len = citations.length;
        for(int i = len - 1; i >= 0; i--){
            if(citations[i] >= len - i)
                h = len - i;
        }
        return h;
    }
}
