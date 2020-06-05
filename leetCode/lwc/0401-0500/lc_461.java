package leetcode;

/**
 * @author lwc
 * @date 2020/2/7 21:34
 */
public class lc_461 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;
        while(z != 0){
            count++;
            z = z & (z - 1);
        }
        return count;
    }
}
