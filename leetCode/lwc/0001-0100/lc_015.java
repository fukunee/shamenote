package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class U15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for(int i = 0; i < length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int left = i + 1, right = length - 1, value = 0 - nums[i];
                while (left < right) {

                    if (nums[left] + nums[right] == value) {
                        rs.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (nums[left] == nums[left + 1]) left++;
                        while (nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (value > nums[left] + nums[right]) left++;
                    else right--;
                }
            }
        }
        return rs;
    }
}
