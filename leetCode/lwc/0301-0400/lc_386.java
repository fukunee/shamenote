package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/12/18 16:01
 */
public class lc_386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> rs = new ArrayList<>();
        help(0, n, rs);
        return rs;
    }

    public void help(int val, int n, List<Integer> rs){
        int i = val == 0 ? 1 : 0;
        for(; i < 10; i++){
            if(val + i > n) break;
            rs.add(val + i);
            help((val + i) * 10, n, rs);
        }
    }
}
