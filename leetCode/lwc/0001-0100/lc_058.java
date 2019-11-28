package solution2;

/**
 * @author lwc
 * @date 2019/10/10 16:20
 */
public class U58 {
    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        return strings.length == 0 ? 0 : strings[strings.length-1].length();
    }
}
