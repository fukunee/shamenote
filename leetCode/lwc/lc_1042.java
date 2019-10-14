package solution2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lwc
 * @date 2019/10/14 17:10
 */
public class U1042 {
    public int[] gardenNoAdj(int N, int[][] paths) {
        int[] values = new int[N];
        Map<Integer, Map> map = new HashMap<>();

        Arrays.sort(paths, (v1, v2) -> {
            if(v1[0] > v2[0]) return 1;
            else if(v1[0] == v2[0]) return Integer.compare(v1[1],v2[1]);
            else return -1;
        });

        for (int[] path : paths) {
            int x = path[0] - 1;
            int y = path[1] - 1;
            if (x > y) {
                int t = x;
                x = y;
                y = t;
            }
            if (values[x] == 0) values[x] = 1;

            int k = 1;
            while (k < values[y] || k == values[x] || map.containsKey(y) && map.get(y).containsKey(k))
                k++;
            values[y] = k;
            if (map.containsKey(y)) map.get(y).put(values[x], 1);
            else {
                Map<Integer, Integer> m = new HashMap<>();
                m.put(values[x], 1);
                map.put(y, m);
            }
        }
        for (int i = 0; i < N; i++) {
            if (values[i] == 0) {
                int k = 1;
                while (map.containsKey(i) && map.get(i).containsKey(k)) k++;
                values[i] = k;
            }
        }
        return values;
    }

    public static void main(String[] args) {
        new U1042().gardenNoAdj(5,new int[][]{{3,4},{4,2},{3,2},{1,3}});
        //new U1042().gardenNoAdj(8,new int[][]{{7,4},{3,7},{1,5},{5,4},{7,1},{3,1},{4,3},{6,5}});
       // new U1042().gardenNoAdj(10,new int[][]{{10,8},{2,1},{4,5},{10,7},{4,2},{7,6},{8,1},{8,4},{7,5},{10,2},{3,5},{3,6}});
    }

}
