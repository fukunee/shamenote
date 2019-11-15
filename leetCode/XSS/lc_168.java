public class lc_168 {
    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(53));
    }
    static class Solution {
        public String convertToTitle(int n) {
            StringBuilder builder=new StringBuilder();
            while (n>0)
            {

                if(n%26==0)builder.append('Z');
                else builder.append((char)('A'-1+n%26));
                n=(n-1)/26;
            }
            return builder.reverse().toString();
        }
    }
}
