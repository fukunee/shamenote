import sun.font.CreatedFontTracker;

import java.util.Arrays;

public class lc_204 {
    public static void main(String[] args) {
        System.out.println(new Solution().countPrimes(10));
    }
    static class Solution {
        public int countPrimes(int n) {
            boolean[]isPrimes=new boolean[n];
            Arrays.fill(isPrimes,true);
            int res=0;
            for(int i=2;i*i<n;i++)
            {
                if(isPrimes[i])
                {
                    for(int j=i*i;j<n;j+=i)
                    {
                        isPrimes[j]=false;
                    }
                }
            }
            for(int i=2;i<n;i++)
            {
                if(isPrimes[i])res++;
            }
            return res;
        }

    }
}
