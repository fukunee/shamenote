package leetcode;

/**
 * @author lwc
 * @date 2019/12/20 11:54
 */
public class lc_392 {
    public boolean isSubsequence(String s, String t) {
        int fromIndex = 0;
        for(char ch : s.toCharArray()){
            int index = t.indexOf(ch, fromIndex);
            if(index == -1) return false;
            fromIndex = index + 1;
        }
        return true;
    }
}
