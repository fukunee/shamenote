package solution2;

import java.util.Arrays;

/**
 * @author lwc
 * @date 2019/10/16 16:45
 */
public class U75 {
    public void sortColors(int[] nums) {
        int l1 = 0;
        int l2 = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            while (l1 < nums.length && nums[l1] == 0) l1++;
            while (l2 >= 0 && nums[l2] == 2) l2--;
            if (nums[i] == 0 && i > l1) {
                swap(nums, l1, i);
                i--;
            } else if (nums[i] == 2 && i < l2) {
                swap(nums, i, l2);
                i--;
            } else continue;
        }
    }

    public void swap(int[] nums, int n1, int n2) {
        int value = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = value;
    }
}
