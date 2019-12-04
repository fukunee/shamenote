package easy;
/*lc_1221*/
public class BalancedStringSplit {
    public static void main(String[] args){
        Solution solution = new BalancedStringSplit().new Solution();
        String s = "RLLLLRRRLR";
        System.out.print(solution.balancedStringSplit(s));
    }
    class Solution {
        public int balancedStringSplit(String s) {
            if(s.length() <= 1){
                return 0;
            }
            int res = 0;
            int temp = 0;
            for(char c : s.toCharArray()){
                if(temp == 0){
                    res++;
                }
                if(c == 'L'){
                    temp -= 1;
                }else {
                    temp += 1;
                }
            }
            return res;
        }
    }
}
