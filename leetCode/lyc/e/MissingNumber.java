package easy;

/*lc_268*/
public class MissingNumber {
    public static void main (String[] args){
        Solution solution = new MissingNumber().new Solution();
        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.print(solution.missingNumber(nums));
    }
    class Solution {
        public int missingNumber(int[] nums) {
            if(0 == nums.length ){
                return  0;
            }

            int res = 0;
            int sum = 0;
            for(int i : nums){
                sum += i;
            }
            int tag = nums.length * (nums.length + 1) / 2 ;

            res = tag - sum;
            return  res;
        }
    }
}
