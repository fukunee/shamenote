class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0]=1;
        
        int a=0,b=0,c=0;
        
        for(int i=1;i<n;i++){
            dp[i]=getMin(dp[a]*2,dp[b]*3,dp[c]*5);
            if(dp[i]==dp[a]*2)
                a++;
            if(dp[i]==dp[b]*3)
                b++;
            if(dp[i]==dp[c]*5)
                c++;
        }
        return dp[n-1];
    }
    
    public int getMin(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
}