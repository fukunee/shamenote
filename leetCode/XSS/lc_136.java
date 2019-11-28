public class lc_136 {
    public static void main(String[] args) {
        //只出现一次的数字，异或解决
    }
    static class Solution {
        public int singleNumber(int[] nums) {
            int res=0;
            for(int i:nums)
            {
                res=res^i;
            }
            return res;
        }
    }
}
