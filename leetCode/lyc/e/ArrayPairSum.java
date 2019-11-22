package easy;
/*lc_561*/
import java.util.Arrays;

public class ArrayPairSum {
    public static void main(String[] args){
        Solution solution = new ArrayPairSum().new Solution();
        int[] nums = new int[]{1,3,2,4,5,7};
        System.out.print(solution.arrayPairSum(nums));

    }
    class Solution {
        public int arrayPairSum(int[] nums) {
            if(nums.length % 2 != 0){
                return -1;
            }
            Arrays.sort(nums);
            int res = 0;
            for(int i = 0;i <nums.length;i += 2){
                res +=nums[i];
            }
            return res;
        }
    }
}
