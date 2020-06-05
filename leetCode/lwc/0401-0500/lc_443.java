package leetcode;

/**
 * @author lwc
 * @date 2020/1/7 9:29
 */
public class lc_443 {
    public int compress(char[] chars) {
        char p = ' ';
        int res = 0, len = 0;
        for (char ch : chars) {
            if (len == 0) {
                p = ch;
                len++;
            } else {
                if (ch == p) len++;
                else {
                    chars[res++] = p;
                    if (len != 1) {
                        String str = len + "";
                        for(char c : str.toCharArray()){
                            chars[res++] = c;
                        }
                    }
                    len = 1;
                    p = ch;
                }
            }
        }
        if (len != 0) {
            chars[res++] = p;
            if (len != 1) {
                String str = len + "";
                for(char c : str.toCharArray()){
                    chars[res++] = c;
                }
            }
        }
        return res;
    }

}
