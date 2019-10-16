//给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
//
// 示例 1: 
//
// 输入: nums = [1,2,3,1], k = 3
//输出: true 
//
// 示例 2: 
//
// 输入: nums = [1,0,1,1], k = 1
//输出: true 
//
// 示例 3: 
//
// 输入: nums = [1,2,3,1,2,3], k = 2
//输出: false 
// Related Topics 数组 哈希表

package cn;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateIi {
    public static void main(String[] args) {

        Solution solution = new ContainsDuplicateIi().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            /**
             * 低效率
             */
//        int i = 0, n = nums.length;
//        while(k > 0){
//            for(i = 0; i+k < n; i++){
//                if(nums[i] == nums[i+k]) return true;
//            }
//            k--;
//        }
//
//        return false;
            Map<Integer, Integer> map = new HashMap<>();
            int i = 0, tmp = 0;
            for(i = 0; i < nums.length; i++){
                if(map.containsKey(nums[i])){
                    tmp = map.get(nums[i]);
                    if((i-tmp) <= k) return true;
                }
                map.put(nums[i], i);
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}