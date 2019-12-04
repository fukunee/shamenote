package leetcode;

import org.omg.CORBA.INTERNAL;

/**
 * @author lwc
 * @date 2019/11/28 11:10
 */
public class lc_306 {
    public boolean isAdditiveNumber(String num) {
        int len = num.length();
        for(int i = 1; i <= len / 2; i++){
            if(i == 1 || num.charAt(0) != '0') {
                for (int j = i + 1; j <= len / 3 * 2; j++) {
                    if(j == i + 1 || num.charAt(i) != '0') {
                        if (isAdditive(
                                Long.parseLong(num.substring(0, i)),
                                Long.parseLong(num.substring(i, j)),
                                num.substring(j))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean isAdditive(long a, long b, String num){
        while(num.length() > 0){
            long c = a + b;
            String temp = String.valueOf(c);
            if(num.length() < temp.length() || !temp.equals(num.substring(0,temp.length())))
                return false;
            num = num.substring(temp.length());
            a = b;
            b = c;
        }
        return num.length() == 0;
    }
}
