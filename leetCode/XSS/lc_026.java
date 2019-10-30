public class lc_026 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int removeDuplicates(int[] nums) {
            int i=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==nums[i])
                {

                }
                else
                {
                    nums[++i]=nums[j];
                }
            }
            return i+1;
        }
    }
}
