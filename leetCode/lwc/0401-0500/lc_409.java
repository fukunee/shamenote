package leetcode;

/**
 * @author lwc
 * @date 2019/12/22 20:03
 */
public class lc_409 {
    public int longestPalindrome(String s) {
        int[] v = new int[58];
        for(char ch : s.toCharArray()){
            v[ch - 'A']++;
        }
        int res = 0;
        for(int i = 0; i < 58; i++){
            res += v[i] - v[i] % 2;
        }
        return res == s.length() ? res : res + 1;
    }
}
