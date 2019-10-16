public class lc_220 {
    public static void main(String[] args) {
        System.out.print(new Solution().containsNearbyAlmostDuplicate(new int[]{-1,2147483647},1,2147483647));
    }
    static class Solution {
        public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
            if(nums.length<=1||k<=0)return false;
            int len=nums.length;
            for(int i=0;i<len;i++)
            {
                for(int j=1;j<=k&&i+j<len;j++)
                {

                    if((long)Math.abs((long)nums[i]-(long)nums[i+j])<=(long)t)
                    {
                        return true;
                    }
                }
            }
            return false;

        }
    }

}
