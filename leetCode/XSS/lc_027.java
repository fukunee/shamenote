import java.util.Arrays;

public class lc_027 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int removeElement(int[] nums, int val) {
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
        }
    }
}
