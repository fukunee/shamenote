package easy;
/*lc_1025*/
public class DivisorGame {
    public static void main(String[] args){
        Solution solution = new DivisorGame().new Solution();
        int N = 9;
        System.out.print(solution.divisorGame(N));
    }
    class Solution {
        public boolean divisorGame(int N) {
            if(N % 2 == 0){
                return true;
            }
            return false;
        }
    }
}
