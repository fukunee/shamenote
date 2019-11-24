package leetcode;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * @author lwc
 * @date 2019/11/21 17:02
 */
public class lc_220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k >= nums.length) return false;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length && j - i <= k; j++){
                long num2 = nums[j];
                long num1 = nums[i];
                if(Math.abs(num2 - num1) <= t) return true;
            }
        }
        return false;
    }


    public boolean hashTree(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            // Find the successor of current element
            Integer s = set.ceiling(nums[i]);
            if (s != null && s <= nums[i] + t) return true;

            // Find the predecessor of current element
            Integer g = set.floor(nums[i]);
            if (g != null && nums[i] <= g + t) return true;

            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public boolean bucket(int[] nums, int k, int t){
        if(t < 0) return false;
        HashMap<Integer,Integer> bucket = new HashMap<>();
        int w = t + 1;
        for(int  i = 0; i < nums.length; i++){
            int v = nums[i];
            int seq = v >= 0 ? v / w : (v + 1) / w - 1;
            if(bucket.containsKey(seq)) return true;
            if(bucket.containsKey(seq - 1) && v - bucket.get(seq - 1) < w) return true;
            if(bucket.containsKey(seq + 1) && bucket.get(seq + 1) - v < w) return true;
            bucket.put(seq, v);
            if(i >= k){
                bucket.remove(nums[i - k] >= 0 ? nums[i - k] / w : (nums[i - k] + 1) / w - 1);
            }
        }
        return false;
    }

}
