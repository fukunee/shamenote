package leetcode;

/**
 * @author lwc
 * @date 2020/4/26 11:52
 */
public class lc_477 {
    public int totalHammingDistance(int[] nums) {
        int[] c = new int[32];
        for(int num : nums){
            for(int i = 0; i < 32 && num > 0; i++){
                if ((num & 0x1) == 1) {
                    c[i] += 1;
                }
                num >>>= 1;
            }
        }
        int len = nums.length;
        int result = 0;
        for(int n : c){
            result += n * (len - n);
        }
        return result;
    }
}
