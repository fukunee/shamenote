//给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
//
// 示例 1: 
//
// 
//输入: [1,2,3]
//输出: 6
// 
//
// 示例 2: 
//
// 
//输入: [1,2,3,4]
//输出: 24
// 
//
// 注意: 
//
// 
// 给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。 
// 输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。 
// 
// Related Topics 数组 数学

package cn;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {

        Solution solution = new MaximumProductOfThreeNumbers().new Solution();
        int[] a = {722, 634, -504, -379, 163, -613, -842, -578, 750, 951, -158, 30, -238, -392, -487, -797, -157, -374, 999, -5, -521, -879, -858, 382, 626, 803, -347, 903, -205, 57, -342, 186, -736, 17, 83, 726, -960, 343, -984, 937, -758, -122, 577, -595, -544, -559, 903, -183, 192, 825, 368, -674, 57, -959, 884, 29, -681, -339, 582, 969, -95, -455, -275, 205, -548, 79, 258, 35, 233, 203, 20, -936, 878, -868, -458, -882, 867, -664, -892, -687, 322, 844, -745, 447, -909, -586, 69, -88, 88, 445, -553, -666, 130, -640, -918, -7, -420, -368, 250, -786};
        System.out.print(solution.maximumProduct(a));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maximumProduct(int[] nums) {
            /**
             * 60%可以改进，因为只要极端的几个数
             * 所以可以不排序
             */
            /*
            if (nums.length == 0) return 0;
            if (nums.length == 3) return (nums[0] * nums[1] * nums[2]);
            Arrays.sort(nums);
            int n = nums.length, i = 0, j = 0, m = 0, temp = 0;
            while (nums[i] < 0) i++;
            if (i > 3) {
                temp = -nums[j];
                if (nums[n - 1] > temp) {
                    m *= temp;
                    j++;
                } else {
                    m *= nums[n - 1];
                    n--;
                }
                return m;
            }
            //0或者1个负数，直接全正
            if (i < 1)
                return (nums[n - 1] * nums[n - 2] * nums[n - 3]);
                //两个以上负数，计算负数最大和
            else if (i > 1) {
                m = nums[0] * nums[1];
                temp = nums[n - 2] * nums[n - 3];
                return (nums[n - 1] *= m > temp ? m : temp);
            }
            return 0;

             */
            /**
             * 95%
             */
            if (nums.length == 0) return 0;
            if (nums.length == 3) return (nums[0] * nums[1] * nums[2]);
            int m = 0, temp = 0, min = 1001, min1 = 0, max = -1001, max1 = 0, max2 = 0;
            for (int num : nums) {//注意这里是int 不是Integer
                if (num > max) {
                    max2 = max1;
                    max1 = max;
                    max = num;
                }
                else if(num > max1){
                    max2 = max1;
                    max1 = num;
                }
                else if(num > max2)
                    max2 = num;

                if (num < min) {
                    min1 = min;
                    min = num;
                }
                else if(num < min1)
                    min1 = num;
            }
            m = min1 * min;
            temp = max1 * max2;
            return (max* (m > temp ? m : temp));
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}