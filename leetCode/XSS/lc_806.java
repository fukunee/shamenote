public class lc_806 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] numberOfLines(int[] widths, String S) {
            int page=1;int left=0;
            int len=S.length();
            for(int i=0;i<len;i++)
            {
                if(left+widths[S.charAt(i)-'a']<=100)left=left+widths[S.charAt(i)-'a'];
                else
                {
                    page++;
                    left=widths[S.charAt(i)-'a'];
                }
            }
            return new int[]{page,left};
        }
    }
}
