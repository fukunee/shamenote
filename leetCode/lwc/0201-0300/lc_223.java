package leetcode;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Arrays;

/**
 * @author lwc
 * @date 2019/11/22 15:09
 */
public class lc_223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        //high : B D F H
        //width : A C E G
        int area = (C - A) * (D - B) + (G - E) * (H - F);
        if (B >= F || F >= D) return area;
        if (A >= G || E >= C) return area;

        int high = Math.min(D,H) - Math.max(B,F);
        int width = Math.min(C,G) - Math.max(A,E);
        return area - high * width;
    }
}
