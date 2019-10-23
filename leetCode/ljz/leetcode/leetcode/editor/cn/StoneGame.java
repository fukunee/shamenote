//亚历克斯和李用几堆石子在做游戏。偶数堆石子排成一行，每堆都有正整数颗石子 piles[i] 。
//
// 游戏以谁手中的石子最多来决出胜负。石子的总数是奇数，所以没有平局。 
//
// 亚历克斯和李轮流进行，亚历克斯先开始。 每回合，玩家从行的开始或结束处取走整堆石头。 这种情况一直持续到没有更多的石子堆为止，此时手中石子最多的玩家获胜。 
//
// 假设亚历克斯和李都发挥出最佳水平，当亚历克斯赢得比赛时返回 true ，当李赢得比赛时返回 false 。 
//
// 
//
// 示例： 
//
// 输入：[5,3,4,5]
//输出：true
//解释：
//亚历克斯先开始，只能拿前 5 颗或后 5 颗石子 。
//假设他取了前 5 颗，这一行就变成了 [3,4,5] 。
//如果李拿走前 3 颗，那么剩下的是 [4,5]，亚历克斯拿走后 5 颗赢得 10 分。
//如果李拿走后 5 颗，那么剩下的是 [3,4]，亚历克斯拿走后 4 颗赢得 9 分。
//这表明，取前 5 颗石子对亚历克斯来说是一个胜利的举动，所以我们返回 true 。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= piles.length <= 500 
// piles.length 是偶数。 
// 1 <= piles[i] <= 500 
// sum(piles) 是奇数。 
// 
// Related Topics 极小化极大 数学 动态规划

package cn;

public class StoneGame {
    public static void main(String[] args) {

        Solution solution = new StoneGame().new Solution();
        int[] a = {3, 9, 1, 2};
        if (solution.stoneGame(a)) System.out.print("1");
        else System.out.print("2");
    }

    class Pair {
        int fir;
        int sec;

        Pair(int fir, int sec) {
            this.fir = fir;
            this.sec = sec;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean stoneGame(int[] piles) {
            /**
             * 数学方法，直接放回true，因为石子堆是偶数堆
             */
            /**
             * 动态规划 16%
             */
            int n = piles.length, i = 0, j = 0, k = 0, left = 0, right = 0;
            Pair[][] a = new Pair[n][n];
            for (; i < n; i++)
                for (j = 0; j < n; j++)
                    a[i][j] = new Pair(0, 0);
            for (i = 0; i < n; i++)
                a[i][i].fir = piles[i];
            for (k = 1; k < n; k++)
                for (i = 0; i < n - k; i++) {
                    j = i + k;
                    right = piles[i] + a[i + 1][j].sec;
                    left = piles[j] + a[i][j - 1].sec;
                    if (right > left) {
                        a[i][j].fir = right;
                        a[i][j].sec = a[i + 1][j].fir;
                    } else {
                        a[i][j].fir = left;
                        a[i][j].sec = a[i][j - 1].fir;
                    }
                }
            return (a[0][n-1].fir > a[0][n-1].sec);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}