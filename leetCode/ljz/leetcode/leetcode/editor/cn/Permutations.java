//给定一个没有重复数字的序列，返回其所有可能的全排列。
//
// 示例: 
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//] 
// Related Topics 回溯算法

package cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Permutations {
    public static void main(String[] args) {

        Solution solution = new Permutations().new Solution();
        int[] a = {1, 2, 3};
        System.out.println(solution.permute(a));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 81%，尝试将visited用位运算替代
         */
        /*version1
        private int n = 0;
        private int[] arr = new int[5];//这个5是面向case编程
        private List<List<Integer>> ret = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        public List<List<Integer>> permute(int[] nums) {
            n = nums.length;
            arr = nums;
            int[] visited = new int[n];
            int i = 0;
           back(visited, 0);
            return ret;
        }

        private void back(int[] visited, int i) {
            if (stack.size() == n) {
                ret.add(new ArrayList<>(stack));
                return;
            }
            for (int x = 0; x < n; x++) {
                if (visited[x] == 0) {
                    stack.add(arr[x]);
                    visited[x] = 1;
                    back(visited, x);
                    stack.pop();
                    visited[x] = 0;
                }
            }

        }

         */
        /**
         * version2 已访问改用位运算 还是81%
         */
        private int n = 0;
        private int[] arr = new int[5];//这个5是面向case编程
        private List<List<Integer>> ret = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        public List<List<Integer>> permute(int[] nums) {
            n = nums.length;
            arr = nums;
            int visited = 0;
            int i = 0;
            back(visited, 0);
            return ret;
        }

        private void back(int visited, int i) {
            if (stack.size() == n) {
                ret.add(new ArrayList<>(stack));
                return;
            }
            for (int x = 0; x < n; x++) {
                if ((visited>>x & 1) == 0) {
                    stack.add(arr[x]);
                    visited ^= (1<<x);
                    back(visited, x);
                    stack.pop();
                    visited ^= (1<<x);
                }
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}