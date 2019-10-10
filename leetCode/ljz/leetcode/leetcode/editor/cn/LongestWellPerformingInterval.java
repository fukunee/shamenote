//给你一份工作时间表 hours，上面记录着某一位员工每天的工作小时数。
//
// 我们认为当员工一天中的工作小时数大于 8 小时的时候，那么这一天就是「劳累的一天」。 
//
// 所谓「表现良好的时间段」，意味在这段时间内，「劳累的天数」是严格 大于「不劳累的天数」。 
//
// 请你返回「表现良好时间段」的最大长度。 
//
// 
//
// 示例 1： 
//
// 输入：hours = [9,9,6,0,6,6,9]
//输出：3
//解释：最长的表现良好时间段是 [9,9,6]。 
//
// 
//
// 提示： 
//
// 
// 1 <= hours.length <= 10000 
// 0 <= hours[i] <= 16 
// 
// Related Topics 栈

package cn;

import java.util.Stack;

public class LongestWellPerformingInterval {
    public static void main(String[] args) {

        Solution solution = new LongestWellPerformingInterval().new Solution();
        int[] a = {6, 6, 6,};
        System.out.print(solution.longestWPI(a));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestWPI(int[] hours) {
            int size = hours.length, i = 0, j = 0, flag = 0, count = 0;
            int[] a = new int[size + 1];
            Stack<Integer> sta = new Stack<Integer>();
            sta.push(0);
            for (; i < size; i++) {
                hours[i] = hours[i] > 8 ? 1 : -1;
                a[i + 1] = a[i] + hours[i];
                if ((!sta.empty() && a[i + 1] < a[sta.peek()]) || sta.empty())
                    sta.push(i + 1);

            }
            j = Integer.MAX_VALUE;
            for (i = size; i >= 0; i--) {
                while (!sta.empty() && a[i] > a[sta.peek()]) {
                    j = sta.pop();
                }
                if (i > j) {
                    count = i - j;

                    if (count > flag)
                        flag = count;
                }

            }


            return flag;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

