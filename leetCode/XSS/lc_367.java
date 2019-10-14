public class lc_367 {
    public static void main(String[] args) {
        System.out.print(String.valueOf(new Solution().isPerfectSquare(16)));
    }
    static class Solution {
        public boolean isPerfectSquare(int num) {
            int sumnum=1;
            while(num>0)
            {
                num-=sumnum;
                sumnum+=2;
            }
            return num==0;
        }
    }
}
