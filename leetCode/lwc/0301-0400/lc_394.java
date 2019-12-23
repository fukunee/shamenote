package leetcode;

import javafx.util.Pair;

/**
 * @author lwc
 * @date 2019/12/20 21:27
 */
public class lc_394 {
    public String decodeString(String s) {
        return help(0, s.toCharArray()).getValue();
    }

    public Pair<Integer,String> help(int i, char[] c){
        String str = "";
        int n = 0;
        for(; i < c.length; i++){
            if(Character.isDigit(c[i])) n = n * 10 + c[i] - '0';
            else if(c[i] == '['){
                Pair<Integer,String> pair = help(i+1, c);
                String t = pair.getValue();
                for(int j = 0; j < n; j++) str += t;
                i = pair.getKey();
                n = 0;
            }
            else if(c[i] == ']')
                return new Pair<>(i, str);
            else
                str += c[i];
        }
        return new Pair<>(i, str);
    }
}
