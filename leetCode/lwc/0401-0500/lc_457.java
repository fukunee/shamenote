package leetcode;

import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author lwc
 * @date 2020/2/2 14:42
 */
public class lc_457 {
    public boolean circularArrayLoop(int[] nums) {
        int len = nums.length;
        if(len < 2) return false;
        HashSet<Integer> all = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < len; i++){
            if(!all.contains(i)) {
                int mark = nums[i], cur = i;
                set = new HashSet<>();
                all.add(cur);
                while (!set.contains(cur)) {
                    set.add(cur);
                    cur = (cur + nums[cur]) % len;
                    if (cur < 0) cur += len;
                    all.add(cur);
                    if (nums[cur] * mark < 0) break;
                }
                if (set.contains(cur)) {
                    int next = (cur + nums[cur]) % len;
                    if (next < 0) next += len;
                    if (cur != next) return true;
                }
            }
        }
        return false;
    }
}
