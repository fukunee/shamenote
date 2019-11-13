package easy;
/*lc_171*/
public class TitleToNumber {
    public static void main(String[] args) {

        Solution solution = new TitleToNumber().new Solution();
        String s = "ZY";
        System.out.print(solution. titleToNumber(s));
    }
    class Solution {
        public int titleToNumber(String s) {
            if (s.length() == 0) {
                return 0;
            }
            int res = 0;
            for(char c : s.toCharArray()){
                res = res * 26 + c - 'A' + 1;
            }
            return res;
        }
    }
}
