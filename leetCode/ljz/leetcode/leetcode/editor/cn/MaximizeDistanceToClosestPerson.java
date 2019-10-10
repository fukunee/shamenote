//在一排座位（ seats）中，1 代表有人坐在座位上，0 代表座位上是空的。
//
// 至少有一个空座位，且至少有一人坐在座位上。 
//
// 亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。 
//
// 返回他到离他最近的人的最大距离。 
//
// 示例 1： 
//
// 输入：[1,0,0,0,1,0,1]
//输出：2
//解释：
//如果亚历克斯坐在第二个空位（seats[2]）上，他到离他最近的人的距离为 2 。
//如果亚历克斯坐在其它任何一个空位上，他到离他最近的人的距离为 1 。
//因此，他到离他最近的人的最大距离是 2 。 
// 
//
// 示例 2： 
//
// 输入：[1,0,0,0]
//输出：3
//解释： 
//如果亚历克斯坐在最后一个座位上，他离最近的人有 3 个座位远。
//这是可能的最大距离，所以答案是 3 。
// 
//
// 提示： 
//
// 
// 1 <= seats.length <= 20000 
// seats 中只含有 0 和 1，至少有一个 0，且至少有一个 1。 
// 
// Related Topics 数组

package cn;

import java.util.LinkedList;
import java.util.Queue;

public class MaximizeDistanceToClosestPerson {
    public static void main(String[] args) {

        Solution solution = new MaximizeDistanceToClosestPerson().new Solution();
        int[] a = {1,0,0,1};
        System.out.print("\n" + solution.maxDistToClosest(a));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxDistToClosest(int[] seats) {
//            Queue<Integer> que = new LinkedList<>();
//            int i = 0, temp1 = 999, temp2 = 999, max = -2, flag = 0;
//            for (; i < seats.length; i++) {
//                if (seats[i] == 1) {
//                    que.offer(i);
//                    seats[i] = 0;
//                } else seats[i] = -1;
//            }
//            while (!que.isEmpty()) {
//                i = que.poll();
//                temp1 = 999;
//                temp2 = 999;
//                if (-1 == seats[i]) {
//                    if (i - 1 >= 0 && seats[i - 1] != -1)
//                        temp1 = seats[i - 1] + 1;
//                    if (i + 1 < seats.length && seats[i + 1] != -1)
//                        temp2 = seats[i + 1] + 1;
//                    seats[i] = temp1 < temp2 ? temp1 : temp2;
//                }
//                if (i - 1 >= 0 && seats[i - 1] == -1) que.offer(i - 1);
//                if (i + 1 < seats.length && seats[i + 1] == -1) que.offer(i + 1);
//                if (seats[i] > max) max = seats[i];
//            }
//            for (Integer num : seats)
//                System.out.print(num + " ");
//            return max;
            /**
             * 比较巧妙的方法
             */
            int count1 = 0;
            int count2 = 0;
            int i = 0, j = seats.length-1;
            // count1记录开头连续0的个数
            while(seats[i] == 0){
                count1++;
                i++;
            }
            while(seats[j] == 0){
                count2++;
                j--;
            }
            int countmid = 0, countmax = 0;
            for(int k = i+1; k <= j; k++){
                if(seats[k] == 0){
                    countmid++;
                }else{
                    countmax = Math.max(countmax, countmid);
                    countmid = 0;
                }
            }
            return Math.max(Math.max(count1, count2), (countmax+1)/2);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}