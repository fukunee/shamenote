package easy;
/*lc_832*/
public class Flipanimage {
    public static void main(String[] args){
        Solution solution = new Flipanimage().new Solution();
        int[][] A= new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        System.out.print(solution.flipAndInvertImage(A));
    }
    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            int m = A.length;
            int n = A[0].length;
            int[][] res = new int[m][n];

            for(int i = 0;i<m;i++){
                for(int j = 0;j < n;j++){
                    res[i][j] = A[i][n-1-j]^1;
                }
            }
            return res;
        }

    }
}
