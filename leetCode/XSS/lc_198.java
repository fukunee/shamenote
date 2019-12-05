import java.util.Arrays;

public class lc_198 {
    public static void main(String[] args) {
        //打家劫舍
    }
    static class Solution {
        public int rob(int[] nums) {
            /*if(nums.length==1)return nums[0];
            if(nums.length==2)return nums[0]>nums[1]?nums[0]:nums[1];
            if(nums.length>=3)
            {
                int a=rob(Arrays.copyOf(nums,nums.length-2))+nums[nums.length-1];
                int b=rob(Arrays.copyOf(nums,nums.length-1));
                return a>b?a:b;
            }
            return 0;*/
            return dynamic(nums);
        }

        public int dynamic(int []nums)
        {
            int len=nums.length;
            if(len<=0)return 0;
            if(len==1)return nums[0];
            int dp[]=new int[len];
            dp[0]=nums[0];
            dp[1]=nums[0]>nums[1]?nums[0]:nums[1];
            for(int i=2;i<len;i++)
            {
                dp[i]=dp[i-2]+nums[i]>dp[i-1]?dp[i-2]+nums[i]:dp[i-1];
            }
            return dp[len-1];

        }
    }
}
