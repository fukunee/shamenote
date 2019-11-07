 //给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。 
//
// 示例: 
//
// 输入: 3
//输出:
//[
// [ 1, 2, 3 ],
// [ 8, 9, 4 ],
// [ 7, 6, 5 ]
//] 
// Related Topics 数组
  
  package cn;
  public class SpiralMatrixIi{
      public static void main(String[] args) {
      
           Solution solution = new SpiralMatrixIi().new Solution();
           solution.generateMatrix(3);
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int[][] generateMatrix(int n) {
        /**
         * 100
         */
        if(n == 1) return new int[][]{{1}};
        int i = 0, j = 0, z = n*n, right = n-1, num = 1, up = 1, down = n-1, left = 0;
        int[][] ret = new int[n][n];
        while(num <= z){
            while(num <= z && j <= right) ret[i][j++] = num++;
            j--;
            i++;
            right--;
            while(num <= z && i <= down) ret[i++][j] = num++;
            i--;
            j--;
            down--;
            while(num <= z && j >= left) ret[i][j--] = num++;
            j++;
            i--;
            left++;
            while(num <= z && i >= up) ret[i--][j] = num++;
            j++;
            i++;
            up++;
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }