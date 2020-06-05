package leetcode;

/**
 * @author lwc
 * @date 2020/4/20 11:25
 */
public class lc_476 {
    public int findComplement(int num) {
        char[] ch  = Integer.toBinaryString(num).toCharArray();
        for(int i = 0; i < ch.length; i++){
            ch[i] = ch[i] == '0' ? '1' : '0';
        }
        return Integer.valueOf(new String(ch), 2);
    }
}

