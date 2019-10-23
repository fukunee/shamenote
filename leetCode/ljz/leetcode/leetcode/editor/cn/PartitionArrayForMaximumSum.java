//给出整数数组 A，将该数组分隔为长度最多为 K 的几个（连续）子数组。分隔完成后，每个子数组的中的值都会变为该子数组中的最大值。
//
// 返回给定数组完成分隔后的最大和。 
//
// 
//
// 示例： 
//
// 输入：A = [1,15,7,9,2,5,10], K = 3
//输出：84
//解释：A 变为 [15,15,15,9,10,10,10] 
//
// 
//
// 提示： 
//
// 
// 1 <= K <= A.length <= 500 
// 0 <= A[i] <= 10^6 
// 
// Related Topics 图

package cn;

public class PartitionArrayForMaximumSum {
    public static void main(String[] args) {

        Solution solution = new PartitionArrayForMaximumSum().new Solution();
        int[] a = {1, 15, 7, 9, 2, 5, 10};
        int k = 3;
        System.out.print(solution.maxSumAfterPartitioning(a, k));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSumAfterPartitioning(int[] A, int K) {
            /**
             * 双100
             */
            int dp[] = new int[A.length + 1];
            dp[0] = 0;
            int i = 0, j = 0, max = 0, m = 0, temp = 0;
            for (; m < A.length; m++) {
                max = 0;
                for (i = 0; i < K; i++) {
                    if (m - i >= 0) {
                        if (A[m - i] > max)
                            max = A[m - i];
                        temp = (i + 1) * max + dp[m - i];
                    } else break;
                    if (temp > dp[m + 1]) dp[m + 1] = temp;
                }
            }
            return dp[m];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}