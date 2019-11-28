package leetcode;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Arrays;

/**
 * @author lwc
 * @date 2019/11/26 19:06
 */
public class lc_242 {
    public boolean isAnagram(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return new String(c1).equals(new String(c2));
    }

}
