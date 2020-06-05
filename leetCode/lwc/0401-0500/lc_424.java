package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lwc
 * @date 2019/12/26 21:32
 */
public class lc_424 {
    public int characterReplacement(String s, int k) {
        int repeat = 0, max = 0, left = 0;
        int[] v = new int[26];
        char [] c = s.toCharArray();
        for(int right = 0; right < c.length; right++){
            repeat = Math.max(repeat, v[++c[right] - 'A']);
            while(repeat + k < right - left + 1){
                v[c[left] - 'A']--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

}
