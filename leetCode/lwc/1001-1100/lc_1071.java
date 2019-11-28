package solution2;

import java.util.regex.Pattern;

/**
 * @author lwc
 * @date 2019/10/14 15:39
 */
public class U1071 {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.isEmpty() || str2.isEmpty()) return "";
        if(str2.length() > str1.length()){
            String temp = str2;
            str2 = str1;
            str1 = temp;
        }
        int divisor = 0;
        while(divisor < str2.length()){
            divisor++;
            if( str2.length() % divisor != 0) continue;
            int length = str2.length() / divisor;
            if(str1.length() % length != 0) continue;
            String pattern = "("+str2.substring(0,length)+")+";

            if(Pattern.matches(pattern,str1)&&Pattern.matches(pattern,str1))
                return str2.substring(0,length);
        }
        return "";
    }

    public String gcdOfStrings2(String str1, String str2) {
        if(str1.isEmpty() || str2.isEmpty()) return "";
        if(str2.length() > str1.length()){
            String temp = str2;
            str2 = str1;
            str1 = temp;
        }
        int divisor = 0;
        while(divisor < str2.length()){
            divisor++;
            if( str2.length() % divisor != 0) continue;
            int length = str2.length() / divisor;
            String str = str2.substring(0,length);
            if(str1.length() % length != 0) continue;
            int i = 0;
            while(i < str1.length()){
                if(!str1.substring(i,i+length).equals(str)) break;
                if(i < str2.length()) {
                    if (!str2.substring(i, i + length).equals(str)) break;
                }
                i = i + length;
            }
            if(i == str1.length()) return str;
        }
        return "";
    }



    public static void main(String[] args) {
        System.out.println(new U1071().gcdOfStrings2("ababab","abab"));
    }
}
