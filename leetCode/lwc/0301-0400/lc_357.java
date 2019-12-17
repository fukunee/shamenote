package leetcode;

/**
 * @author lwc
 * @date 2019/12/11 15:43
 */
public class lc_357 {
    public int countNumbersWithUniqueDigits(int n) {
        int[] v = new int[n + 1];
        v[0] = 1;
        for(int i = 1; i < n + 1; i++){
            int value = 9;
            for(int j = i - 1, k = 9; j > 0; j--){
                value *= k--;
            }
            v[i] = v[i-1] + value;
        }
        return v[n];
    }

}
