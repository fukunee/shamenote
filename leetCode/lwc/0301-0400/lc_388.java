package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author lwc
 * @date 2019/12/19 10:10
 */
public class lc_388 {
    public int lengthLongestPath(String input) {
        int max = 0, res = 0, k = 0, mark = 0;
        int[] v = new int[25];
        v[0] = -1;
        for(char ch : input.toCharArray()){
            if(ch == '\n'){
                v[k+1] = res + 1 + v[k];
                if(mark > 0)
                    max = Math.max(max, v[k+1]);
                res = 0; k = 0; mark = 0;
            }
            else if(ch == '\t')
                k++;
            else {
                if(ch == '.') mark = 1;
                res++;
            }
        }
        if(mark > 0) max = Math.max(max, res+1+v[k]);
        return max;
    }
}
