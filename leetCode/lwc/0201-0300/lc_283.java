package leetcode;

/**
 * @author lwc
 * @date 2019/11/27 15:25
 */
public class lc_283 {
    public void moveZeroes(int[] nums) {
        int end = nums.length;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 0 && i < end){
                int j = i;
                while(j + 1 < end){
                    if(nums[j+1] != 0) {
                        int temp = nums[j + 1];
                        nums[j + 1] = nums[j];
                        nums[j] = temp;
                    }
                    j ++;
                }
                end--;
                if(nums[i] == 0) i--;
            }
        }
    }
}
