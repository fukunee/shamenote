package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2020/1/4 20:49
 */
public class lc_438 {
    public List<Integer> findAnagrams(String s, String p) {
        int[] v = new int[26];
        List<Integer> rs = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        for(char ch : p.toCharArray()){
            set.add(ch);
            v[ch - 'a']++;
        }

        char[] c = s.toCharArray();
        int left = 0, res = 0;
        int[] t = Arrays.copyOf(v, v.length);
        for(int i = 0; i < c.length; i++){
            char ch = c[i];
            if(!set.contains(ch)){
                res = 0; left = i + 1;
                t = Arrays.copyOf(v, v.length);
            }
            else{
                if(t[ch - 'a'] > 0){
                    res++;
                    t[ch - 'a']--;
                    if(res == p.length()){
                        rs.add(left);
                        t[c[left] - 'a']++;
                        res--;
                        left++;
                    }
                }
                else{
                    while(c[left] != c[i]){
                        t[c[left] - 'a']++;
                        left++;
                        res--;
                    }
                    left++;
                }
            }
        }
        return rs;
    }
}
