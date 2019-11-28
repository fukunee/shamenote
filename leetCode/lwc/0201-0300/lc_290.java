package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author lwc
 * @date 2019/11/27 20:00
 */
public class lc_290 {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String[] strs = str.split(" ");
        char[] paths = pattern.toCharArray();
        if(strs.length != paths.length) return false;
        for(int i = 0; i < paths.length; i++){
            char ch = paths[i];
            String string = strs[i];

            if(!map.containsKey(ch)) {
                if(set.contains(string))
                    return false;
                map.put(ch, string);
                set.add(string);
            }
            if(!map.get(ch).equals(string))
                return false;
        }
        return true;
    }
}
