package solution2;

import java.util.Arrays;

public class U16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int rs = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int lt = i + 1;
            int rt = nums.length - 1;
            while (lt < rt) {
                int value = nums[i] + nums[lt] + nums[rt];
                if (Math.abs(rs - target) > Math.abs(value - target))
                    rs = value;
                else if (value - target > 0) rt--;
                else lt++;
            }
        }
        return rs;
    }
}
