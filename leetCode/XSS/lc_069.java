public class lc_069 {
    public static void main(String[] args) {
//平方根问题，可用二分法以及牛顿迭代法，使用牛顿迭代法应理解推导公式 ***
    }
    static class Solution {
        public int mySqrt(int x) {
            long left = 0;
            long right = x / 2 + 1;
            while (left < right) {
                long mid = (left + right + 1) >>> 1;
                long square = mid * mid;
                if (square > x) {
                    right = mid - 1;
                } else {
                    left = mid;
                }
            }
            return (int) left;
        }
    }

}
