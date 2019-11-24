package leetcode;

import java.util.HashSet;

/**
 * @author lwc
 * @date 2019/11/18 14:59
 */
public class lc_202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(n)) {
            set.add(n);
            int value = 0;
            while (n != 0) {
                value += Math.pow(n % 10,2);
                n = n / 10;
            }
            if (value == 1) return true;
            n = value;
        }
        return false;
    }


    private int bitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int bit = n % 10;
            sum += bit * bit;
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy2(int n) {
        int slow = n, fast = n;
        do {
            slow = bitSquareSum(slow);
            fast = bitSquareSum(fast);
            fast = bitSquareSum(fast);
            if(fast == 1 || slow == 1)
                return true;
        } while (slow != fast);

        return slow == 1;
    }

}
