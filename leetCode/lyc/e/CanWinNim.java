package easy;
/*lc_292*/
public class CanWinNim {
    public static void main (String[] args){
        Solution solution = new CanWinNim().new Solution();
        int n = 4 ;
        System.out.print(solution.canWinNim(n));
    }
    class Solution {
        public boolean canWinNim(int n) {
            return  n % 4 == 0;
        }
    }
}
