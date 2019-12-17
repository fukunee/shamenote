public class lc_268 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int missingNumber(int[] nums) {
            int n=nums.length;
            int all=0;
            for(int i:nums)
            {
                all+=i;
            }
            return ((1+n)*n)/2-all;
        }
    }
}
