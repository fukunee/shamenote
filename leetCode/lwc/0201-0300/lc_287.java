package leetcode;

import java.util.Arrays;

/**
 * @author lwc
 * @date 2019/11/27 16:30
 */
public class lc_287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == nums[i])
                return nums[i];
        }
        return -1;
    }

    public int findDuplicate2(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
