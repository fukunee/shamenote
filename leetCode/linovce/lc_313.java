class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        dp[0] = 1;
        
        int[] t = new int[primes.length];
        
        for(int i=1;i<n;i++){
            dp[i] = getMin(t,primes,dp);
            
            for(int j=0;j<primes.length;j++){
                if(dp[i]==dp[t[j]] * primes[j])
                    t[j]++;
            }
        }
        
        return dp[n-1];
    }
    
    public int getMin(int[] n,int[] primes,int[] dp){
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n.length;i++){
            if(min>dp[n[i]]*primes[i])
                min=dp[n[i]]*primes[i];
        }
        
        return min;
    }
}