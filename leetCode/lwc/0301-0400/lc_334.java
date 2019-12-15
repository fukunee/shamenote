package leetcode;

/**
 * @author lwc
 * @date 2019/12/9 9:26
 */
public class lc_334 {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3)
            return false;
        Integer a = nums[0], b = null, c = null;

        int i = 1;
        while(b == null && i < nums.length){
            if(nums[i] <= a) a = nums[i++];
            else b = nums[i++];
        }

        if(b == null || i == nums.length) return false;

        for(;i < nums.length; i++){
            int num = nums[i];
            if(num == a || num == b) continue;
            if(num < a){
                if(c == null || num <= c) c = num;
                else{
                    a = c;
                    b = num;
                    c = null;
                }
            }
            else if(num < b) b = nums[i];
            else return true;
        }
        return false;
    }
}
