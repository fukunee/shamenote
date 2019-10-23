//有一堆石头，每块石头的重量都是正整数。
//
// 每一回合，从中选出两块最重的石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下： 
//
// 
// 如果 x == y，那么两块石头都会被完全粉碎； 
// 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。 
// 
//
// 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。 
//
// 
//
// 提示： 
//
// 
// 1 <= stones.length <= 30 
// 1 <= stones[i] <= 1000 
// 
// Related Topics 堆 贪心算法

package cn;

import java.util.*;
import java.util.stream.Collectors;

public class LastStoneWeight {
    public static void main(String[] args) {

        Solution solution = new LastStoneWeight().new Solution();
        int[] a = {2, 7, 4, 1, 8, 1};
        System.out.print(solution.lastStoneWeight(a));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lastStoneWeight(int[] stones) {
            //用优先级队列做，每次弹出头部
            /**
             * 82%
             */
            /*
            Queue<Integer> queue = new PriorityQueue<>(500,  new Comparator<Integer>(){
                public int compare(Integer i,Integer j){
                    return (-i + j);
                }
            });
            int n = stones.length, i = 0, j = 0;
            if (n == 1) return stones[0];
            for (; i < n; i++)
                queue.offer(stones[i]);
            while (queue.size() > 1) {
                i = queue.poll();
                j = queue.poll();
                if (i > j) i -= j;
                else i = j - i;
                queue.offer(i);
            }
            if (queue.size() == 0) return 0;
            return queue.peek();

             */
            /**
             * 99%
             */
            if (stones.length == 1) return stones[0];
            int j = stones.length - 1;
            while(j > 0){
                Arrays.sort(stones);
                stones[j-1] = stones[j] - stones[j-1];
                j--;
            }
            return stones[0];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}