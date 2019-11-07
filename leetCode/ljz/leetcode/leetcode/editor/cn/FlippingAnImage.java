 //832
 // 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
//
// 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。 
//
// 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。 
//
// 示例 1: 
//
// 
//输入: [[1,1,0],[1,0,1],[0,0,0]]
//输出: [[1,0,0],[0,1,0],[1,1,1]]
//解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
//     然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
// 
//
// 示例 2: 
//
// 
//输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
//     然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
// 
//
// 说明: 
//
// 
// 1 <= A.length = A[0].length <= 20 
// 0 <= A[i][j] <= 1 
// 
// Related Topics 数组
  
  package cn;
  public class FlippingAnImage{
      public static void main(String[] args) {
      
           Solution solution = new FlippingAnImage().new Solution();
           int[][] a = {{1,1,0}, {1,0,1},{0,0,0}};
           solution.flipAndInvertImage(a);
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        /**
         * 感觉可以通过判断减少修改
         * 1    1 -》 0  0
         * 1    0 -》 1  0
         * 0    1 -》 0  1
         * 0    0 -》 1  1
         * 果然100
         */
        int m = A.length, j = A[0].length-1, i = 0, k = 0;
        while(i < j){
            for(k = 0; k < m; k++){
                if(A[k][i] != A[k][j]) continue;
                else{
                    A[k][i] ^= 1;
                    A[k][j] = A[k][i];
                }
            }
            i++;
            j--;
        }
        if(i == j)
            for(k = 0; k < m; k++)
                A[k][i] ^= 1;
        return A;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }