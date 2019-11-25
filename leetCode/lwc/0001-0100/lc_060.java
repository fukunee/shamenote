package solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/11 11:45
 */
public class U60 {
    public String getPermutation(int n, int k) {
        StringBuffer rs = new StringBuffer();

        List<Integer> numList = new ArrayList<>();
        for(int i = 1; i <=n; i++){
            numList.add(i);
        }

        int[] v = new int[n];
        v[0] = 1;
        for(int i = 1; i < v.length; i++){
            v[i] = v[i-1] * i;
        }

        while (k > 0) {
            if(n < 2)
                rs.append(numList.remove(--k));
            else {
                int pos = (k - 1) / v[n - 1];
                rs.append(numList.remove(pos));
                k = k - v[--n] * pos;
            }
        }
        if(!numList.isEmpty()) rs.append(numList.remove(0));
        return rs.toString();
    }
}
