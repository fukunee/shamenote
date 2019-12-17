package leetcode;

/**
 * @author lwc
 * @date 2019/12/9 17:19
 */
public class lc_344 {
    public void reverseString(char[] s) {
        int len = s.length;
        for(int i = 0; i < len / 2; i++){
            char temp = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = temp;
        }
    }
}
