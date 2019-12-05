public class lc_171 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int titleToNumber(String s) {
            char[] cs=s.toCharArray();
            int res=0;
            for(char c:cs)
            {
                res=res*26+(c-'A'+1);
            }
            return res;
        }
    }
}
