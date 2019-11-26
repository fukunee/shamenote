package solution2;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lwc
 * @date 2019/10/12 10:43
 */
public class U65 {
    public boolean isNumber(String s) {
        String s1 = s.trim();
        if(s1.length() < 1) return false;
        String pattern = "([+-]?)((\\d+\\.?\\d*)|(\\.\\d+))(e[+-]?[0-9]\\d*)?";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(s1);
        return m.matches();
    }


    public boolean isNumber2(String s){
        String s1 = s.trim();
        int length = s1.length();
        if(length < 1) return false;

        Map<Character,Integer> map1 = new HashMap<>();
        map1.put('.',0); map1.put('+',0); map1.put('e',0); map1.put('-',0);


        int ep = length;
        for(int i = 0; i < length; i++){
            char c = s1.charAt(i);

            if(!map1.containsKey(c) && !Character.isDigit(c)) return false;

            if(c=='-'||c=='+'){
                if(i!=0) return false;
                if(i==length-1 || s1.charAt(i+1)== 'e') return false;
            }

            if(c=='.'){
                if(map1.get(c)!=0) return false;
                if(i==0){
                    if(i==length-1 || !Character.isDigit(s1.charAt(i+1)))
                        return false;
                }
                if(i==1 && !Character.isDigit(s1.charAt(0))){
                    if(i==length-1 || !Character.isDigit(s1.charAt(i+1)))
                        return false;
                }

            }
            if(c=='e') {
                if(i == length-1 || i==0) return false;
                else {
                    ep = i + 1;
                    break;
                }
            }
            if(map1.containsKey(c)) map1.put(c,1);
        }

        for(int i = ep; i < length; i++){
            char c = s1.charAt(i);
            if(i==ep && (c=='+'||c=='-')){
                if(i == length-1) return false;
                else continue;
            }
            if(!Character.isDigit(c)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new U65().isNumber2(" 005047e+6"));
    }
}
