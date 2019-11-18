package easy;
/*lc_852*/
public class PeakIndexInMountainArray {
    public static void main(String[] args){
        Solution solution = new PeakIndexInMountainArray().new Solution();
        int[] A = new int[]{0,2,3,0};
        System .out.print(solution.peakIndexInMountainArray(A));
    }
    class Solution {
        public int peakIndexInMountainArray(int[] A) {
            int i = 1;
            for( i = 1;i < A.length;i++){
                if(A[i] < A[i - 1]){
                    break;
                }
            }
            return i - 1;
        }
    }
}
