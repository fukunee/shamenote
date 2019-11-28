package easy;

/*lc_905*/

public class SortArrayByParity {
    public static void main(String[] args){
        Solution solution = new SortArrayByParity().new Solution();
        int[] A = new int[]{3,1,2,4};
        System.out.print(solution.sortArrayByParity(A));
    }
    class Solution {
        public int[] sortArrayByParity(int[] A) {
            if(A.length == 0){
                return A;
            }
            int[] res = new int[A.length];
            int i = 0;
            int j = A.length - 1;
            for(int k = 0;k<res.length;k++){
                if(A[k] % 2 == 0) {
                    res[i++] = A[k];
                }else{
                    res[j--] = A[k];
                }
            }
            return res;
        }
    }
}
