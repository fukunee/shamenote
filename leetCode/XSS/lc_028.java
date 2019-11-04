public class lc_028 {
    public static void main(String[] args) {
//实现 strStr(),最佳实现为kmp
    }
    static class Solution {
        public int strStr(String haystack, String needle) {
            int hlen = haystack.length();
            int nlen = needle.length();
            if (nlen == 0) return 0;
            if (hlen == 0) return -1;

            for (int i = 0; i < hlen - nlen + 1; i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    boolean b = true;
                    for (int j = 1; j < nlen; j++) {
                        if (haystack.charAt(i + j) == needle.charAt(j)) {

                        } else {
                            b = false;
                            break;
                        }
                    }
                    if (b)
                        return i;
                }
            }
            return -1;
        }
    }
}