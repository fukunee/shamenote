package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/10 14:29
 */
public class U57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();

        for (int[] interval : intervals) {

            if (newInterval[1] < interval[0] || interval[1] < newInterval[0])
                list.add(interval);
            else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        list.add(newInterval);
        int[][] v = list.toArray(new int[0][0]);
        Arrays.sort(v, (v1, v2) -> Integer.compare(v1[0], v2[0]));
        return v;
    }
}
