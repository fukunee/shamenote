package solution2;

import java.math.BigInteger;

public class U43 {
    public String multiply(String num1, String num2){
        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);
        return b1.multiply(b2).toString();
    }


    public String add(String num1, String num2){
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;

        StringBuffer rs = new StringBuffer();
        int carry = 0;

        while (p1 >= 0 && p2 >= 0) {
            int v1 = Character.getNumericValue(num1.charAt(p1--));
            int v2 = Character.getNumericValue(num2.charAt(p2--));

            rs.append((v1 + v2 + carry) % 10);
            carry = (v1 + v2 + carry) / 10;

        }

        int p = p1 > p2 ? p1 : p2;
        String num = p1 > p2 ? num1 : num2;
        while (p >= 0) {
            int v = Character.getNumericValue(num.charAt(p--));

            rs.append((v + carry) % 10);
            carry = (v + carry) / 10;
        }

        if (carry > 0) rs.append(carry);

        return rs.reverse().toString();
    }


}
