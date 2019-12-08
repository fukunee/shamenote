package leetcode;

/**
 * @author lwc
 * @date 2019/12/2 16:01
 */
public class lc_313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int len = primes.length;
        int[] p = new int[len];
        int[] v = new int[n];

        v[0] = 1; int m = 1;
        while(m < n){
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < len; i++){
                int value = primes[i] * v[p[i]];
                if(value < min) min = value;
            }
            for(int i = 0; i < len; i++){
                int value = primes[i] * v[p[i]];
                if(value == min) p[i]++;
            }
            v[m++] = min;
        }
        return v[n-1];
    }
}
