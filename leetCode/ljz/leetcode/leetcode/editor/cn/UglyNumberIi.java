//编写一个程序，找出第 n 个丑数。
//
// 丑数就是只包含质因数 2, 3, 5 的正整数。 
//
// 示例: 
//
// 输入: n = 10
//输出: 12
//解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。 
//
// 说明: 
//
// 
// 1 是丑数。 
// n 不超过1690。 
// 
// Related Topics 堆 数学 动态规划

package cn;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;

public class UglyNumberIi {

    public static void main(String[] args) {

        Solution solution = new UglyNumberIi().new Solution();
        solution.nthUglyNumber(20);

    }

    /**
     * 2,3,5
     * 2*2=4
     * 2*3=6
     * <p>
     * 2*1 3*0 5*0 2
     * 2*0 3*1 5*0 3
     * 2*2 3*0 5*0 4
     * 2*0 3*0 5*1 5
     * 2*3 3*0 5*0 6
     * 2*4 3*0 5*0 8
     * 2*0 3*3 5*0 9
     * 2*1 3*0 5*1 10
     * 2*6 3*0 5*0 12
     */
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int nthUglyNumber(int n) {
            int[] ugly = new int[1691];
            ugly[0] = 1;
            int a[] = {0, 0, 0};
            int x = 0, y = 0, z = 0, i = 1, j = 0, l = 0;
            while (i < n) {
                x = ugly[a[0]] * 2;
                y = ugly[a[1]] * 3;
                z = ugly[a[2]] * 5;
                j = Math.min(z, Math.min(x, y));
                ugly[i++] = j;
                if(j == x) a[0]++;
                if(j == y) a[1]++;
                if(j == z) a[2]++;
                System.out.print(" "+ugly[i-1]);


            }
            return ugly[n - 1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}