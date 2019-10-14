public class lc_486 {
    public static void main(String[] args) {
        System.out.print(String.valueOf(new Solution().PredictTheWinner(new int[]{1,5,2})));
    }
    static class Solution {
        public boolean PredictTheWinner(int[] nums) {
            int len=nums.length;
            if(len==0) return false;
            if(len%2==0) return true;
            int [][]dp=new int[len][len];
            for(int i=0;i<len;i++) dp[i][i]=nums[i];
            for(int i=len-1;i>=0;i--)
            {
                for(int j=i+1;j<len;j++)
                {
                    dp[i][j]=Math.max(nums[i]-dp[i+1][j],nums[j]-dp[i][j-1]);
                }
            }
            return dp[0][len-1]>=0;
        }
    }
}
