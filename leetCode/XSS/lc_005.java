public class lc_005 {
    public static void main(String[] args) {

    }
    //最长回文子串
    class Solution {
        public String longestPalindrome(String s) {
            int n=s.length();
            if(n<=1)return s;

            boolean dp[][]=new boolean[n][n];
            int max=0;String maxsubs=s.substring(0,1);
            for(int j=1;j<n;j++)
            {
                for(int i=0;i<j;i++)
                {
                    if(s.charAt(i)==s.charAt(j)&&(j-i<=2||dp[i+1][j-1]))
                    {
                        dp[i][j]=true;
                        if(j-i+1>max)
                        {
                            max=j-i+1;
                            maxsubs=s.substring(i,j+1);
                        }
                    }
                }
            }
            return maxsubs;

        }
    }
}
