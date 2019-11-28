package solution2;

/**
 * @author lwc
 * @date 2019/10/9 10:07
 */
public class U53 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int rs = res;
        for(int i = 1;i < nums.length;i++) {
            res = Math.max(res+nums[i],nums[i]);
            rs = Math.max(rs,res);
        }
        return res;
    }

    public static void main(String[] args) {
        new U53().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}
