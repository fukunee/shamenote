package solution2;

/**
 * @author lwc
 * @date 2019/11/14 22:47
 */
public class U171 {
    public int titleToNumber(String s) {
        int value = 0;
        char[] chars = s.toCharArray();
        int len = chars.length;
        for(int i = len - 1; i >= 0; i--){
            value += (chars[i] - 'A' + 1) * Math.pow(26, len - 1 - i);
        }
        return value;
    }
}
