package leetcode;

import javax.print.attribute.HashAttributeSet;
import java.util.*;

/**
 * @author lwc
 * @date 2019/11/16 20:05
 */
public class lc_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map = new HashMap<>();
        List<String> rs = new ArrayList<>();
        for(int i = 0; i <= s.length() - 10; i++){
            String temp = s.substring(i, i + 10);
            if(map.containsKey(temp)) {
                if(map.get(temp) == 1) {
                    rs.add(temp);
                    map.put(temp, 2);
                }
            }
            else map.put(temp, 1);
        }
        return rs;
    }
}
