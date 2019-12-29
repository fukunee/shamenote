package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2019/12/24 14:21
 */
public class lc_416 {
    int[] map;
    List<Integer> list;
    public boolean canPartition(int[] nums) {
        int total = 0;
        map = new int[101];
        list = new ArrayList<>();
        for(int num : nums){
            if(map[num] == 0) list.add(num);
            map[num] += 1;
            total += num;
        }
        if(total % 2 == 1) return false;
        Collections.sort(list);
        return help(0, total / 2);
    }

    public boolean help(int start, int target){
        for(int i = start; i < list.size(); i++){
            int num = list.get(i);
            int k = map[num];
            if(target % num == 0 && target / num <= k) return true;
            for(int j = 1; j <= k; j++){
                if(target >= num * j){
                    if(help(i + 1, target - num * j))
                        return true;
                }
                else return false;
            }
        }
        return false;
    }
}
