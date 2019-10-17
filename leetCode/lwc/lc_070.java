package solution2;

/**
 * @author lwc
 * @date 2019/10/16 11:09
 */
public class U70 {
    public int climbStairs(int n) {
        int[] v = new int[n+1];
        v[0] = 1;
        v[2] = 1;
        for(int i = 2; i < n+1; i++){
            v[i] = v[i-1] + v[i-2];
        }
        return v[n];
    }
}
