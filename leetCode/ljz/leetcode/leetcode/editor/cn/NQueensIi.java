//n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
//
// 
//
// 上图为 8 皇后问题的一种解法。 
//
// 给定一个整数 n，返回 n 皇后不同的解决方案的数量。 
//
// 示例: 
//
// 输入: 4
//输出: 2
//解释: 4 皇后问题存在如下两个不同的解法。
//[
// [".Q..",  // 解法 1
//  "...Q",
//  "Q...",
//  "..Q."],
//
// ["..Q.",  // 解法 2
//  "Q...",
//  "...Q",
//  ".Q.."]
//]
// 
// Related Topics 回溯算法

package cn;

import javafx.util.Pair;
import org.omg.CORBA.INTERNAL;

import java.util.*;

public class NQueensIi {
    private int x = 0, ret = 0;

    public static void main(String[] args) {

        Solution solution = new NQueensIi().new Solution();
        System.out.print(solution.totalNQueens(10));
    }

    private boolean canPutHere(int i, int j, Stack<Pair<Integer, Integer>> stack) {
        Pair<Integer, Integer> temp;
        for (Pair<Integer, Integer> pair : stack) {
            if (i == pair.getKey() || j == pair.getValue() || Math.abs(i - pair.getKey()) == Math.abs(j - pair.getValue()))
                return false;
        }
        return true;
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int totalNQueens(int n) {
            x = n;
            /**
             * 9%,看看题解怎么写的，也是用的回溯，但是当一个棋子放下以后，
             * 会排除相应行列和对角线，进行了剪枝，我本来也是准备这么做，
             * 但是对于点撤回之后，行列信息更新没有想清楚就没这么写，
             * 现在尝试加入保存行列信息的写法
             */
            /*versi1
            int i = 0, j = 0, count = 0;
            Stack<Pair<Integer, Integer>> stack = new Stack<>();
            int[][] arr = new int[n][n];
            Pair<Integer, Integer> temp;
            //每次到一个新的点，再判断这个点是否可以放棋子
            for (i = 0; i < n; i++) {
                for (; j < n; j++) {
                    //System.out.println(i+" "+j);
                    if (canPutHere(i, j, stack)) {
                        stack.push(new Pair<>(i, j));
                        if (stack.size() == n) {
                            count++;
                            //System.out.println(count);
                            do{
                                temp = stack.pop();
                                i = temp.getKey() - 1; //-1是因为for又会给他加1
                                j = temp.getValue() + 1; //如果==n,继续网上取
                            }
                            while (!stack.empty() && j == n);
                            break;
                        }
                        j = 0;
                        break;
                    } else {
                        if (j < n - 1) continue;
                        else {
                            j += 1;
                            while (j == n && !stack.empty()) {
                                temp = stack.pop();
                                i = temp.getKey() - 1; //-1是因为for又会给他加1
                                j = temp.getValue() + 1; //如果==n,继续网上取
                            }

                            break;
                        }
                    }
                }
            }
            return count;

             */
            //version2 16% 改进的是只用遍历一半，不用全部遍历，比之前快了6ms，
            /**
             * 但是还是不够快，下面使用位运算
             */
            /*
            int i = 0, j = 0, count = 0, flag = 0, sum = 0;
            Stack<Pair<Integer, Integer>> stack = new Stack<>();
            int[][] arr = new int[n][n];
            Pair<Integer, Integer> temp;
            //每次到一个新的点，再判断这个点是否可以放棋子，偶数遍历一半就可以，奇数遍历一半，中间的只加一次
            if (n % 2 == 1) flag = 1;
            for (i = 0; i < n; i++) {
                //System.out.println("j ="+j+"(n+1/2)="+(n + 1) / 2);
                if (i == 0 && j == (n + 1) / 2)
                    return (flag == 0) ? (sum + count + count) : sum + count;
                else if(i == 0){
                    sum += (count + count);
                    count = 0;
                    //System.out.println("sum="+sum);
                }
                for (; j < n; j++) {
                    //System.out.println(i+" "+j);
                    if (canPutHere(i, j, stack)) {
                        stack.push(new Pair<>(i, j));
                        if (stack.size() == n) {
                            count++;
                            //System.out.println("count="+count);
                            do {
                                temp = stack.pop();
                                i = temp.getKey() - 1; //-1是因为for又会给他加1
                                j = temp.getValue() + 1; //如果==n,继续网上取
                            }
                            while (!stack.empty() && j == n);
                            break;
                        }
                        j = 0;
                        break;
                    } else {
                        if (j < n - 1) continue;
                        else {
                            j += 1;
                            while (j == n && !stack.empty()) {
                                temp = stack.pop();
                                i = temp.getKey() - 1; //-1是因为for又会给他加1
                                j = temp.getValue() + 1; //如果==n,继续网上取
                            }

                            break;
                        }
                    }
                }
            }
            return sum;

             */
            /**
             * version3 位运算
             */
            back(0, 0, 0, 0);
            return ret;
        }
        //0ms 100%
        private void back(int row, int col, int left, int right) {
            if (row >= x) {
                ret++;
                return;
            }
            int allbit = ~(col | left | right) & ((1 << x) - 1);
            while (allbit != 0) {
                int freebit = allbit & -allbit;
                back(row + 1, (col | freebit), (left | freebit) << 1, (right | freebit) >> 1);
                allbit &= (allbit - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}