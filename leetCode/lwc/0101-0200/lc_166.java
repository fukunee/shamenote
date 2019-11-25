package solution2;

import java.util.HashMap;

/**
 * @author lwc
 * @date 2019/11/13 23:32
 */
public class U166 {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder str = new StringBuilder();
        if((numerator > 0) ^ (denominator > 0))
            str.append("-");
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        HashMap<Long,Integer> map = new HashMap<>();
        str.append(num / den);
        num = num % den;
        if(num == 0) return str.toString();
        str.append(".");
        while(num != 0){
            if(map.containsKey(num)){
                str.insert(map.get(num),"(");
                str.append(")");
                return str.toString();
            }
            map.put(num, str.length());
            str.append(num * 10 / den);
            num = num * 10 % den;
        }
        return str.toString();
    }



}
