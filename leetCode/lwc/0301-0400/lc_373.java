package leetcode;

import javafx.geometry.Pos;
import javafx.util.Pair;

import java.util.*;

/**
 * @author lwc
 * @date 2019/12/12 20:15
 */
public class lc_373 {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int len1 = nums1.length, len2 = nums2.length;
        List<List<Integer>> rs = new ArrayList<>();
        if(len1 == 0 || len2 == 0 || k == 0) return rs;

        PriorityQueue<int[]> queue = new PriorityQueue<>((v1, v2)->v1[2] - v2[2]);
        for(int i = 0; i < len1; i++){
            queue.offer(new int[]{i, 0, nums1[i] + nums2[0]});
        }

        while(k > 0 && !queue.isEmpty()){
            int[] v = queue.poll();
            rs.add(Arrays.asList(nums1[v[0]], nums2[v[1]]));
            if(v[1] + 1 < len2){
                queue.offer(new int[]{v[0], v[1]+1, nums1[v[0]] + nums2[v[1] + 1]});
            }
            k--;
        }
        return rs;
    }
}
