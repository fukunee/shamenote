package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2019/12/20 22:03
 */
public class lc_395 {
    public int longestSubstring(String s, int k) {
        int len = s.length();
        if (len == 0 || k > len) return 0;
        if (k < 2) return len;
        return help(s.toCharArray(), 0, len, k);
    }

    public int help(char[] c, int l, int r, int k){
        if(l >= r || l >= c.length) return 0;
        int[] lst = new int[26];
        HashSet<Character> set = new HashSet<>();
        for(int i = l; i < r; i++){
            char ch = c[i];
            set.add(ch); lst[ch-'a']++;
            if(lst[ch-'a'] >= k) set.remove(ch);
        }
        if(set.isEmpty()) return r - l;
        int pos = l,max = 0;
        for(int i = l; i < r; i++){
            if(set.contains(c[i])){
                max = Math.max(max,help(c, pos, i, k));
                pos = i + 1;
            }
        }
        return Math.max(help(c, pos, c.length, k), max);
    }
}
