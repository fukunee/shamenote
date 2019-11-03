package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/29 21:05
 */
public class U120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0) return 0;
        int[] pre = new int[]{triangle.get(0).get(0)};
        for(int i = 1; i < triangle.size(); i++){
            int[] cur = new int[i+1];
            for(int j = 0; j < i+1; j++){
                int curValue = triangle.get(i).get(j);
                if(j == 0)
                    cur[j] = pre[j] + curValue;
                else if(j == i)
                    cur[j] = pre[j-1] + curValue;
                else
                    cur[j] = Math.min(pre[j-1],pre[j]) + curValue;
            }
            pre = cur;
        }
        Arrays.sort(pre);
        return pre[0];
    }

}
