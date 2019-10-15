package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author lwc
 * @date 2019/10/14 14:38
 */
public class U66 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;

        int array = 1;
        int pos = length - 1;
        while (array != 0 && pos >= 0) {
            if (digits[pos] < 9) {
                digits[pos] += 1;
                array = 0;
            } else
                digits[pos] = 0;
            pos--;
        }
        if(array == 0)
            return digits;
        else
            return IntStream.concat(IntStream.of(1),Arrays.stream(digits)).toArray();
    }

    public int[] plusOne2(int[] digits) {
        int length = digits.length;
        int [] value = new int[length+1];
        value[0] = 1;

        int array = 1;
        int pos = length - 1;
        while (array != 0 && pos >= 0) {
            if (digits[pos] < 9) {
                digits[pos] += 1;
                array = 0;
            } else
                digits[pos] = 0;
            value[pos+1] = digits[pos];
            pos--;
        }
        if(array == 0)
            return digits;
        else
            return value;
    }
}
