package leetcode;

import javax.print.attribute.HashDocAttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author lwc
 * @date 2019/11/27 21:55
 */
public class lc_299 {
    public String getHint(String secret, String guess) {
        char[] sec = secret.toCharArray();
        char[] gue = guess.toCharArray();
        int A = 0; int B = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < sec.length; i++) {
            char ch = sec[i];
            if(ch == gue[i]) A++;
            else{
                if (map.containsKey(ch))
                    map.put(ch, map.get(ch) + 1);
                else map.put(ch, 1);
            }
        }
        for(int i = 0; i < gue.length; i++){
            if(gue[i] != sec[i] && map.containsKey(gue[i]) && map.get(gue[i]) > 0){
                B++;
                map.put(gue[i], map.get(gue[i])-1);
            }
        }
        return A+"A"+B+"B";
    }
}
