package solution2;

/**
 * @author lwc
 * @date 2019/11/3 21:58
 */
public class U136 {
    public int singleNumber(int[] nums) {
        int value = nums[0];
        for(int i = 1; i < nums.length; i++){
            value ^= nums[i];
        }
        return value;
    }
}
