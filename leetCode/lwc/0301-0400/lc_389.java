package leetcode;

/**
 * @author lwc
 * @date 2019/12/20 9:13
 */
public class lc_389 {
    public char findTheDifference(String s, String t) {
        int[] v = new int[26];
        for(char ch : s.toCharArray()){
            v[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            if(v[ch - 'a'] == 0)
                return ch;
            else v[ch - 'a']--;
        }
        return 'a';
    }
}
