package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/11/21 11:09
 */
public class lc_216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> rs = new ArrayList<>();
        backTrack(rs, new ArrayList<>(), k, n, 1);
        return rs;
    }

    public void backTrack(List<List<Integer>> rs, List<Integer> temp, int k, int n, int start){
        if(n <= 0){
            if(temp.size() == k && n==0)
                rs.add(new ArrayList<>(temp));
            return;
        }

        if(temp.size() + 10 - start >= k) {
            for (int i = start; i < 10; i++) {
                temp.add(i);
                backTrack(rs, temp, k, n - i, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
