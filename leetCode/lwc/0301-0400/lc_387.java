package leetcode;

/**
 * @author lwc
 * @date 2019/12/19 9:38
 */
public class lc_387 {
    public int firstUniqChar(String s) {
        int[] c = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int pos = ch - 'a';
            if(c[pos] == 0) {
                int index = s.indexOf(ch, i + 1);
                if(index == -1) return i;
                c[pos] = 1;
            }
        }
        return -1;
    }
}
