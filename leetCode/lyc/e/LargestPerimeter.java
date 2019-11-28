package easy;
/*lc_976*/
import java.util.Arrays;

public class LargestPerimeter {
    public static void main(String[] args){
        Solution solution = new LargestPerimeter().new Solution();
        int[] A = new int[]{3,2,3,4};
        System.out.print(solution.largestPerimeter(A));
    }
    class Solution {
        public int largestPerimeter(int[] A) {
            if(A.length < 3){
                return 0;
            }
            Arrays.sort(A);
            for(int i = A.length - 1;i >= 2;i--){
                if(A[i - 2] + A[i - 1] > A[i]){
                    return A[i - 2] + A[i - 1] + A[i];
                }
            }
            return 0;
        }
    }
}
