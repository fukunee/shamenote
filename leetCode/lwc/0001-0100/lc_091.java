package solution2;

/**
 * @author lwc
 * @date 2019/10/21 11:20
 */
public class U91 {
    public int numDecodings(String s) {
        if(s.isEmpty()) return 1;
        if(s.charAt(0) == '0') return 0;
        int rs = 0;
        if(s.length() > 1 && (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0') <= 26)
            rs += numDecodings(s.substring(2));
        if((s.charAt(0) - '0') != 0)
            rs += numDecodings(s.substring(1));
        return rs;
    }

    public int numDecodings2(String s) {
        if(s.charAt(0) == '0') return 0;
        int[] v = new int[s.length()];
        v[0] = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != '0') v[i] += v[i-1];
            if(s.charAt(i-1) != '0' &&
                    (s.charAt(i-1) - '0') * 10 + (s.charAt(i) - '0') <= 26) {
                v[i] += i > 1 ? v[i - 2] : 1;
            }
        }
        return v[s.length()-1];
    }

}
