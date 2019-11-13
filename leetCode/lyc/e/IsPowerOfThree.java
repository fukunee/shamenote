package easy;

/*lc_326*/
public class IsPowerOfThree {
    public static void main (String[] args){
        Solution solution = new IsPowerOfThree().new Solution();
        int n = 27;
        System.out.print(solution.isPowerOfThree(n));
    }
    class Solution {
        public boolean isPowerOfThree(int n) {
            if(n == 0){
                return false;
            }
            while(n % 3 == 0 ){
                n /= 3;
            }
            return n == 1;
        }
    }
}
