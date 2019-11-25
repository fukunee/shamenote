package solution2;

/**
 * @author lwc
 * @date 2019/10/16 9:41
 */
public class U67 {

    public String addBinary(String a, String b) {
        String str1 = a.length() >= b.length() ? a : b;
        String str2 = a.length() >= b.length() ? b : a;

        int len1 = str1.length() - 1;
        int len2 = str2.length() - 1;

        int carry = 0;
        StringBuffer buffer = new StringBuffer();
        while (len1 >= 0 && len2 >= 0) {
            int num1 = str1.charAt(len1) - '0';
            int num2 = str2.charAt(len2) - '0';
            buffer.append((num1 + num2 + carry) % 2);
            carry = (num1 + num2 + carry) / 2;
            len1--;
            len2--;
        }

        while (len1 >= 0) {
            int num1 = str1.charAt(len1) - '0';
            buffer.append((num1 + carry) % 2);
            carry = (num1 + carry) / 2;
            len1--;
        }

        if (carry != 0) buffer.append(carry);

        return buffer.reverse().toString();
    }
}
