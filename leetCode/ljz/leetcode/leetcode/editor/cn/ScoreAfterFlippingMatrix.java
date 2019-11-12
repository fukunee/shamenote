//有一个二维矩阵 A 其中每个元素的值为 0 或 1 。
//
// 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。 
//
// 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。 
//
// 返回尽可能高的分数。 
//
// 
//
// 
// 
//
// 示例： 
//
// 输入：[[0,0,1,1],[1,0,1,0],[1,1,0,0]]
//输出：39
//解释：
//转换为 [[1,1,1,1],[1,0,0,1],[1,1,1,1]]
//0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 20 
// 1 <= A[0].length <= 20 
// A[i][j] 是 0 或 1 
// 
// Related Topics 贪心算法

package cn;

public class ScoreAfterFlippingMatrix {
    public static void main(String[] args) {

        Solution solution = new ScoreAfterFlippingMatrix().new Solution();
        int[][] a = {{1, 0, 1}, {0, 1, 1}, {0, 0, 1}};
        //int[][] a = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        //int[][] a = {{0,1},{1,1}};
        System.out.println(solution.matrixScore(a));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int matrixScore(int[][] A) {
            /**
             * 100%
             */
            int i = 0, j = 0, count = 0, sum = 0, half = A.length/2;
            for (; i < A.length; i++) {
                if (A[i][0] == 1) continue;
                for (j = 1; j < A[0].length; j++) {
                    A[i][j] ^= 1;
                }
            }
            sum += A.length * (1 << (A[0].length-1));
            for (j = 1; j < A[0].length; j++) {
                count = 0;
                for (i = 0; i < A.length; i++) {
                    if (A[i][j] == 1)
                        count++;
                }
                if(count <= half) count = A.length-count;
                sum += count*(1 << (A[0].length-j-1));
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}