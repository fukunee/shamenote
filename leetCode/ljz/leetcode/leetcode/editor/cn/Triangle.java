//给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
//
// 例如，给定三角形： 
//
// [
//     [2],
//    [3,4],
//   [6,5,7],
//  [4,1,8,3]
//]
// 
//
// 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。 
//
// 说明： 
//
// 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。 
// Related Topics 数组 动态规划

package cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {

        Solution solution = new Triangle().new Solution();
        List<List<Integer>> result = new LinkedList<>();
        result.add(new LinkedList<>(Arrays.asList(2)));
        result.add(new LinkedList<>(Arrays.asList(3, 4)));
        result.add(new LinkedList<>(Arrays.asList(6, 5, 7)));
        result.add(new LinkedList<>(Arrays.asList(4, 1, 8, 3)));
        solution.minimumTotal(result);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            /**
             * 95%
             */
            int i = 0, j = 0, m = triangle.size(), n = triangle.get(m - 1).size(), min = 9999, k = 0, z = 0;
            int[][] a = new int[2][n];
            //a[0][0] = triangle.get(0).get(0);

            for (; i < m; i++) {
                a[k][0] = a[1 - k][0] + triangle.get(i).get(0);
                System.out.print(" " + a[k][0]);
                for (j = 1; j < i; j++) {
                    z = k ^ 1;
                    a[k][j] = Math.min(a[z][j - 1], a[z][j]) + triangle.get(i).get(j);
                    System.out.print(" " + a[k][j]);
                }
                if (j == i) {
                    a[k][j] = a[z][j - 1] + triangle.get(i).get(j);
                    System.out.print(" " + a[k][j]);
                }
                k = k ^ 1;
                System.out.print("\n");

            }
            for (int num : a[1 - k]) {
                if (num < min) min = num;
            }

            return min;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}