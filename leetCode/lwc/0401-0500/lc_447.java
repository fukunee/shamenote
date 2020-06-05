package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lwc
 * @date 2020/1/14 19:44
 */
public class lc_447 {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < points.length; i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            map = new HashMap<>();
            for(int j = 0; j < points.length; j++){
                int x2 = points[j][0];
                int y2 = points[j][1];
                int val = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
            for(int val : map.values()){
                res += val * (val - 1);
            }
        }
        return res;
    }
}
