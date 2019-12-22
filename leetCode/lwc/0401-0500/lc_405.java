package leetcode;

/**
 * @author lwc
 * @date 2019/12/22 16:42
 */
public class lc_405 {
    public String toHex(int num) {
        return Integer.toHexString(num);
    }

    public String toHex2(int num) {
        if(num == 0) return "0";
        String res = "";
        String hexStr = "0123456789abcdef";
        while(num != 0){
            res = hexStr.charAt(num&15) + res;
            num = num >>> 4;
        }
        return res;
    }
}
