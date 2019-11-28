package leetcode;

/**
 * @author lwc
 * @date 2019/11/25 18:09
 */
public class lc_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] v = new int[nums.length];
        int pos = -1;
        int total = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(pos > -1) return v;
                else pos = i;
            }
            else total *= nums[i];
        }
        if(pos != -1) v[pos] = total;
        else{
            for(int i = 0; i < nums.length; i++){
                v[i] = total / nums[i];
            }
        }
        return v;
    }
}
