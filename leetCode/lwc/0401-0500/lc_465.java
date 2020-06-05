package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author lwc
 * @date 2020/3/15 16:07
 */
public class lc_465 {
    public int findSubstringInWraproundString(String p) {
        String[] v = new String[26];
        char[] ch = p.toCharArray();
        int result = 0;
        for(int i = 0; i < ch.length; i++){
            int start = i;
            while(i + 1 < ch.length && (ch[i] + 1) % 26 == ch[i + 1] % 26) i++;
            for(int j = start; j <= i; j++){
                String pre = v[ch[j] - 'a'] == null ? "" : v[ch[j] - 'a'];
                if (pre.length() >= i + 1 - j) break;
                else {
                    result += i - j + 1 - pre.length();
                    v[ch[j] - 'a'] = p.substring(j, i + 1);
                }
            }
        }
        return result;
    }
}


