//给定一个大小为 n 的数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
//
// 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1)。 
//
// 示例 1: 
//
// 输入: [3,2,3]
//输出: [3] 
//
// 示例 2: 
//
// 输入: [1,1,1,3,3,2,2,2]
//输出: [1,2] 
// Related Topics 数组

package cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementIi {
    public static void main(String[] args) {

        Solution solution = new MajorityElementIi().new Solution();
        int[] a = {1, 3, 3, 4};
        System.out.println(solution.majorityElement(a));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            List<Integer> ret = new ArrayList<>();
            if (nums.length == 0) return ret;
            if (nums.length == 1) {
                ret.add(nums[0]);
                return ret;
            }
            int i = 0, a = 0, count1 = 0, count2 = 0;
            int can1= nums[0], can2 = nums[1];
            for(i = 0; i < nums.length; i++){
                if(nums[i] == can1) count1++;
                else if(nums[i] == can2) count2++;
                else if(count1 == 0){
                    can1 = nums[i];
                    count1++;
                }
                else if(count2 == 0){
                    can2 = nums[i];
                    count2++;
                }
                else{
                    count1--;
                    count2--;
                }
            }
            for(i = 0, count1 = 0, count2 = 0; i < nums.length; i++){
                if(nums[i] == can1) count1++;
                else if(nums[i] == can2) count2++;
            }
            if(count1 > nums.length/3) ret.add(can1);
            if(count2 > nums.length/3) ret.add(can2);
            return ret;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}