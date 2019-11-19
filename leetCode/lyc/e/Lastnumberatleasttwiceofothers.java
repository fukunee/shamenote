package easy;
/*lc_747*/
import java.util.Arrays;

public class Lastnumberatleasttwiceofothers {
    public static void main(String[] args){
        Solution solution = new Lastnumberatleasttwiceofothers().new Solution();
        int[] nums = new int[]{3, 2, 1, 4};
        System.out.print(solution.dominantIndex(nums));
    }
    class Solution {
        public int dominantIndex(int[] nums) {
            if(nums.length == 0){
                return  -1;
            }
            if(nums.length == 1){
                return 0;
            }
            int[] copy = new int[nums.length];
            int k = 0;
            for(int num : nums){
                copy[k++] = num;
            }
            Arrays.sort(copy);
            int res = -1;
            int bignum = copy[nums.length - 1];
            int senum = copy[nums.length - 2];
            if(bignum < senum*2){
                return  -1;
            }else {
                for(int i = 0;i < nums.length;i++){
                    if(nums[i] == bignum){
                        res = i;
                        break;
                    }
                }
            }
            return res;
        }
    }
}
