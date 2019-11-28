package easy;

public class Shortestunsortedcontinuoussubarray {
    public static void main(String[] args){
        Solution solution = new Shortestunsortedcontinuoussubarray().new Solution();
        int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15};
        System.out.print(solution.findUnsortedSubarray(nums));
    }
    class Solution {
        public int findUnsortedSubarray(int[] nums) {
            int res = -1;
            int left = 0;
            int right = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 0;i < nums.length;i++){
                if(max > nums[i]){
                    right = i;
                }
                max = Math.max(max,nums[i]);
            }
            for(int j = nums.length - 1;j >= 0;j--){
                if(min < nums[j]){
                    left = j;
                }
                min = Math.min(min,nums[j]);
            }
            res = left == right ? 0: right - left + 1;
            return res;
        }
    }
}
