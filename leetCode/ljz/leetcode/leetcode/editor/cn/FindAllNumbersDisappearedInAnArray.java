//给定一个范围在 1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
//
// 找到所有在 [1, n] 范围之间没有出现在数组中的数字。 
//
// 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。 
//
// 示例: 
//
// 
//输入:
//[4,3,2,7,8,2,3,1]
//
//输出:
//[5,6]
// 
// Related Topics 数组

package cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {

        Solution solution = new FindAllNumbersDisappearedInAnArray().new Solution();
        int[] a = {4, 3, 2, 7, 8, 2, 3, 1};
        solution.findDisappearedNumbers(a);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            /*int i = 0, n = nums.length, j = 1;
            Arrays.sort(nums);
            List<Integer> list = new ArrayList<>();
            for (; j <= n && i < n; ) {
                while (nums[i] > j) {
                    list.add(j);
                    j++;
                }
                if(nums[i] == j){
                    i++;
                    j++;
                }
                else i++;
            }
            while (j <= n) list.add(j++);
            System.out.print(list);
            return list;*/
            /**
             * 要排序的地方可以进行优化，数据类型比较特殊
             */
            int i = 0, j = 0, n = nums.length, temp = 0;
            List<Integer> list = new ArrayList<>();
            for (; i < n; i++) {
                while (nums[nums[i] - 1] != nums[i]) {
                    temp = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = temp;
                }
            }
            for (i = 0; i < n; i++) {
                if (nums[i] != (i + 1))
                    list.add(i + 1);
            }
        System.out.print(list);
        return list;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}