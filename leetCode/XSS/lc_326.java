public class lc_326 {
    //3的幂
    public static void main(String[] args) {

    }
    static class Solution {
        public boolean isPowerOfThree(int n) {
            if(n==0)return false;
            if(n==1)return true;
            if(n%3!=0)return false;
            else return isPowerOfThree(n/3);
        }
        /*3是质数
        public boolean isPowerOfThree(int n) {
            return n > 0 && 1162261467 % n == 0;
        }*/
    }
}
