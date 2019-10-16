public class lc_264 {
    public static void main(String[] args) {
        System.out.println(new Solution().nthUglyNumber(12));
    }
    static class Solution {
        public int nthUglyNumber(int n) {
            int dp[]=new int[n];
            dp[0]=1;
            int p2=0,p3=0,p5=0;
            for(int i=0;i<n-1;i++)
            {
                int min=Math.min(dp[p5]*5,Math.min(dp[p2]*2,dp[p3]*3));
                if(min==dp[p2]*2) p2++;
                if(min==dp[p3]*3) p3++;
                if(min==dp[p5]*5) p5++;
                dp[i+1]=min;
            }
            return  dp[n-1];
        }

    }
}
