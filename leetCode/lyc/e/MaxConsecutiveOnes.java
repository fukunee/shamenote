package easy;
/*lc_485*/
public class MaxConsecutiveOnes {
    public static void main(String[] args){
        Solution solution = new MaxConsecutiveOnes().new Solution();
        int[] nums = new int[]{1,1,0,1,1,1};
        System.out.print(solution.findMaxConsecutiveOnes(nums));
    }
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            if(nums.length == 0){
                return 0;
            }
            int res = Integer.MIN_VALUE;
            int sum = 0;
            for(int i = 0;i<nums.length;i++){

                if(nums[i] == 1){
                    sum +=1;
                }
                if(nums[i] == 0){
                    res = Math.max(res,sum);

                    sum = 0;
                }
            }
            return Math.max(res,sum);
        }
    }
}
