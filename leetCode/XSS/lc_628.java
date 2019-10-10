import java.util.Arrays;

public class lc_628 {
    public static void main(String[] args) {
        int nums[]=new int[] {-9,-10,-1,-2,-3,4,5,0,8};
        System.out.println(new Solution().maximumProduct(nums));
    }
    static class Solution {
            public int maximumProduct(int[] nums) {
                int max1 = Integer.MIN_VALUE,max2=max1+1, max3 = max2+1;
                int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE-1;
                for (int num : nums) {
                    if (num > max1) {
                        max3=max2;
                        max2=max1;
                        max1=num;
                    } else if (num > max2) {
                        max3=max2;
                        max2=num;
                    } else if (num > max3) {
                        max3=num;
                    }

                    if (num < min1) {
                        min2=min1;
                        min1 = num;
                    } else if (num < min2) {
                        min2=num;
                    }
                }
                return Math.max(max2 * max3 * max1, min1 * min2 * max1) ;
            }
        }
}
