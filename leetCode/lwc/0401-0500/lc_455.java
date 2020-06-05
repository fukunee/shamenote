package leetcode;

import java.util.Arrays;

/**
 * @author lwc
 * @date 2020/1/28 13:46
 */
public class lc_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0, v = 0;
        for(int i = 0; i < g.length; i++){
            while(j < s.length && g[i] > s[j]) j++;
            if(j < s.length) {v++; j++;}
            else break;
        }
        return v;
    }
}
