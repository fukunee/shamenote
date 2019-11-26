package easy;
/*lc_53*/
public class MaximumSubarray {
    public static void main(String[] args){
        Solution solution = new MaximumSubarray().new Solution();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(solution.maxSubArray(nums));
    }
    class Solution {
        public int maxSubArray(int[] nums) {
            int res = nums[0];
            int sum = 0;
            for(int num: nums) {
                if(sum > 0) {
                    sum += num;
                } else {
                    sum = num;
                }
                res = Math.max(res, sum);
            }
            return res;
        }
    }
}
