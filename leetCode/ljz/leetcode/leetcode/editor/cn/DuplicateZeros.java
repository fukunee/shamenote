//给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
//
// 注意：请不要在超过该数组长度的位置写入元素。 
//
// 要求：请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。 
//
// 
//
// 示例 1： 
//
// 输入：[1,0,2,3,0,4,5,0]
//输出：null
//解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
// 
//
// 示例 2： 
//
// 输入：[1,2,3]
//输出：null
//解释：调用函数后，输入的数组将被修改为：[1,2,3]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10000 
// 0 <= arr[i] <= 9 
// 
// Related Topics 数组

package cn;

public class DuplicateZeros {
    public static void main(String[] args) {

        Solution solution = new DuplicateZeros().new Solution();
        //int[] a = {0, 1, 9, 2, 6, 0, 0, 4, 1, 0};
        //int[] a = {1, 0, 2, 3, 0, 4, 5, 0};
        //int[] a = {1, 5, 2, 0, 6, 8, 0, 6, 0};
        int[] a = {8, 4, 5, 0, 0, 0, 0, 7};
        solution.duplicateZeros(a);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void duplicateZeros(int[] arr) {
            /**
             * 双100
             */
            int n = arr.length, i = 0, j = n - 1, count = 0;
            for (; i < n; ) {
                if (arr[i] == 0) count++;
                if (count + i == n - 1) break;
                if (count + i > n - 1) {
                    arr[n-1] = 0;
                    j = n - 2;
                    i--;
                    count--;
                    break;
                }
                i++;
            }
            if (count == 0) return;
            for (; j >= 0 && count > 0; j--, i--) {
                if (arr[i] == 0) {
                    count--;
                    arr[j] = 0;
                    j--;
                    if (j >= 0)
                        arr[j] = 0;
                } else arr[j] = arr[i];
            }
            for (int num : arr)
                System.out.print(" " + num);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}