package solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/23 20:25
 */
public class U96 {
    public int numTrees2(int n) {
        int[] v = new int[n+1];
        v[0] = 1;
        v[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++) {
                v[i] += v[j - 1] * v[i-j];
            }
        }
        return v[n];
    }

    public int numTrees(int n){
        if(n <= 1) return 1;
        int count = 0;
        for(int len = 1; len <= n; len++)
            count += numTrees(len-1) * numTrees(n-len);
        return count;
    }

}
