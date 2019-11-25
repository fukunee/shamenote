package solution2;

import java.util.TreeSet;

/**
 * @author lwc
 * @date 2019/10/12 15:28
 */
public class U264 {
    public int nthUglyNumber(int n) {
        int m = (int) Math.sqrt(2 * n);
        int max = (int) Math.pow(2, m);

        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);

        int[] v = new int[Math.max(max,20)];
        int pos = 0;
        int i = 0;
        v[0] = 1;

        while (v[pos] != 0) {
            int v1 = v[pos] * 2;
            int v2 = v[pos] * 3;
            int v3 = v[pos] * 5;

            if (v1 <= max && set.add(v1))
                v[++i] = v1;
            if (v2 <= max && set.add(v2))
                v[++i] = v2;
            if (v3 <= max && set.add(v3))
                v[++i] = v3;
            pos++;
        }


        int j = 1;
        for (int s : set) {
            if (j++ == n) return s;
        }

        return 0;
    }




}
