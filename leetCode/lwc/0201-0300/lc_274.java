package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author lwc
 * @date 2019/11/27 9:37
 */
public class lc_274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0,len = citations.length;
        for(int i = len - 1; i >= 0; i--){
            if(citations[i] >= len - i && (i == 0 || citations[i-1] < len - i))
                h = len - i;
        }
        return h;
    }
}
