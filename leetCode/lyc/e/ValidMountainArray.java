package easy;
/*lc_941*/
public class ValidMountainArray {
    public static void main(String[]args){
        Solution solution = new ValidMountainArray().new Solution();
        int[] A = new int[]{1,3,2,4};
        System.out.print(solution.validMountainArray(A));
    }
    class Solution {
        public boolean validMountainArray(int[] A) {
            if(3 > A.length){
                return false;
            }
            if(A[1] < A[0]){
                return false;
            }
            int i = 0;
            int temp = 0;
            int res = 0;
            while(i < A.length - 1){
                if(A[i] >= A[i+1]){
                    temp = i;
                    res = A[i];
                    break;
                }
                i++;
            }
            if(i == A.length - 1){
                return false;
            }
            int k = temp;
            while (k < A.length - 1){
                if(A[k + 1] >= A[k]){
                    return false;
                }
                k++;
            }
            return true;
        }
    }
}
