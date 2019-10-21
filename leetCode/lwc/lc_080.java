package solution2;

/**
 * @author lwc
 * @date 2019/10/19 23:20
 */
public class U80 {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length < 2) return length;
        int l = 1;
        int r = 0;
        int value = 1;
        int pre = nums[0];
        for (int i = 1; i < length; i++) {
            if (nums[i] == pre) {
                value++;
                if (value == 3) r = l = i;
                if (value > 3) r++;
            }
            if(nums[i] != pre || i == length) {
                if (value >= 3) {
                    i = l;
                    while (r + 1 < length) {
                        nums[l] = nums[r + 1];
                        l++;
                        r++;
                    }
                    length = length - (r - l + 1);
                }
                value = 1;
                pre = nums[i];
            }
        }
        if(value >= 3) length = length - (r - l + 1);
        return length;
    }
}
