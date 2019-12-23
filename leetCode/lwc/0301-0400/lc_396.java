package leetcode;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author lwc
 * @date 2019/12/21 16:14
 */
public class lc_396 {
    public int maxRotateFunction2(int[] A) {
        int len = A.length;
        long total = 0, preVal = 0;
        for(int i = 0; i < len; i++){
            total += A[i];
            preVal += i * A[i];
        }
        long max = preVal;
        for(int i = len - 1; i > 0; i--){
            preVal = preVal - (len-1) * A[i] + total - A[i];
            if(preVal > max) max = preVal;
        }
        return (int)max;
    }
}
