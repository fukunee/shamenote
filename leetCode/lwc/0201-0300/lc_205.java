package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author lwc
 * @date 2019/11/18 22:28
 */
public class lc_205 {
    public boolean isIsomorphic(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0; i < c1.length; i++){
            if(!map.containsKey(c1[i]) && !map.containsValue(c2[i]))
                map.put(c1[i],c2[i]);
            else if(map.containsKey(c1[i]) && map.get(c1[i]) != c2[i] ||
                    !map.containsKey(c1[i]) && map.containsValue(c2[i])) return false;
            else continue;
        }
        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if(s.indexOf(ch1[i]) != t.indexOf(ch2[i])){
                return false;
            }
        }
        return true;
    }
}
