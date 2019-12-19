public class lc_342 {
    //4的幂，位运算，4的幂转化为二进制有奇数位为1的规律
    class Solution {
        public boolean isPowerOfFour(int num) {
            if (num <= 0)
                return false;
            //先判断是否是 2 的幂
            if ((num & num - 1) != 0)
                return false;
            //如果与运算之后是本身则是 4 的幂
            if ((num & 0x55555555) == num)
                return true;
            return false;
        }
    }
}
