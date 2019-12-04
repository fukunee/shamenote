package easy;
/*lc_922*/
public class SortArrayByParityII {
    public static void main(String[] args){
        Solution solution = new SortArrayByParityII().new Solution();
        int[] A = new int[]{4,2,5,7};
        System.out.print(solution.sortArrayByParityII(A));
    }
    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            if(A.length <= 1){
                return A;
            }
            int[] res = new int[A.length];
            int i = 0;
            int j = 1;
            for(int num : A){
                if(num % 2 == 0){
                    res[i] = num;
                    i += 2;
                }else{
                    res[j] = num;
                    j += 2;
                }
            }
            return res;
        }
    }
}
