public class lc_190 {
    public static void main(String[] args) {
        //颠倒二进制位
        System.out.println(new Solution().reverseBits(43261596));
    }
    static class Solution {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            int k=1;int res=0;
            for(int i=0;i<32;i++)
            {
                int temp=n&1;
                res=res+(temp<<(31-i));
                n=n>>1;
            }
            return res;
        }
    }
}
