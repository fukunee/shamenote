package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author lwc
 * @date 2019/11/20 20:52
 */
public class lc_215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int heap(int[] nums, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int n : nums){
            heap.add(n);
            if(heap.size() > k)
                heap.poll();
        }
        return heap.poll();
    }
}
