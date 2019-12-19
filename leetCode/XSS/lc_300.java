import java.util.Arrays;
import java.util.Map;

public class lc_300 {
    public static void main(String[] args) {
        //最长上升子序列，*****
    }
    static class Solution {
        public int lengthOfLIS(int[] nums) {
            //dp、贪心二分、树数组法
            int n=nums.length;
            if(n==1||n==0)return n;
            int dp[]=new int[n];
            Arrays.fill(dp,1);
            for(int i=1;i<n;i++)
            {
                int cur=nums[i];
                for(int j=0;j<i;j++) {
                    if (cur>nums[j])
                    {
                        dp[i]= Math.max(dp[i],dp[j]+1);
                    }
                }
            }
            int res=0;
            for(int i=0;i<dp.length;i++)
            {
                res=Math.max(res,dp[i]);
            }
            return res;
        }
    }
}
