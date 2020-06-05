package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2020/1/19 11:23
 */
public class lc_452 {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) return 0;
        Arrays.sort(points, (v1,v2) -> v1[0] - v2[0]);

        int res = 0, end = Integer.MAX_VALUE;
        for(int[] v : points){
            if(v[0] <= end){
                end = Math.min(v[1], end);
            }
            else{
                res++;
                end = v[1];
            }
        }
        return ++res;
    }
}
