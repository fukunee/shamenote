public class lc_172 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int trailingZeroes(int n) {
            int count=0;
            while (n>0)
            {
                count+=n/5;
                n/=5;
            }
            return count;
        }
    }
}
