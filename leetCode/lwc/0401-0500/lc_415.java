package leetcode;

/**
 * @author lwc
 * @date 2019/12/24 11:29
 */
public class lc_415 {
    public String addStrings(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        String s1 = len1 >= len2 ? num1 : num2;
        String s2 = len1 >= len2 ? num2 : num1;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int carry = 0;
        StringBuilder res = new StringBuilder();
        int i = c1.length - 1, j = c2.length - 1;
        for(; j >= 0; j--,i--){
            int value = c1[i] - '0' + c2[j] - '0' + carry;
            res.append(value % 10);
            carry = value / 10;
        }
        for(; i >= 0; i--){
            int value = c1[i] - '0' + carry;
            res.append(value % 10);
            carry = value / 10;
        }
        if(carry > 0) res.append(carry);
        return res.reverse().toString();
    }
}
