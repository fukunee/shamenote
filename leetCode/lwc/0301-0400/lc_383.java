package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @author lwc
 * @date 2019/12/18 9:35
 */
public class lc_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : ransomNote.toCharArray()){
            if(!map.containsKey(c)) return false;
            int v = map.get(c);
            if(v <= 0) return false;
            map.put(c, --v);
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {

        if(ransomNote.length() > magazine.length())return false;

        int caps[] = new int[26];

        for(char c : ransomNote.toCharArray()){
            int index = magazine.indexOf(c, caps[c - 97]);
            if(index == -1)
                return false;
            caps[c - 97] = index+1;
        }

        return true;
    }

}
