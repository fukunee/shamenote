package easy;
/*lc_190*/
public class ReverseBits {
    public static void main(String[] args){

    }
    public class Solution {
        public int reverseBits(int n) {
            n = (n & 0x55555555) << 1 | (n >>> 1) & 0x55555555;
            n = (n & 0x33333333) << 2 | (n >>> 2) & 0x33333333;
            n = (n & 0x0f0f0f0f) << 4 | (n >>> 4) & 0x0f0f0f0f;
            n = (n << 24) | ((n & 0xff00) << 8) |
                    ((n >>> 8) & 0xff00) | (n >>> 24);
            return n;
        }
    }
}
