package leetcode;

/**
 * @author lwc
 * @date 2019/12/11 17:31
 */
public class lc_367 {
    public boolean isPerfectSquare(int num) {
        if(num == 0) return true;
        for(int i = 1; i <= num; i++){
            int j = num / i;
            if(j * j == num) return true;
            if(j < i) break;
        }
        return false;
    }
    public boolean isPerfectSquare2(int num) {
        int l = 0, r = 46340;
        while (l <= r) { // 二分法找根
            int mid = l + (r - l) / 2;
            long power = mid * mid;
            if (power > num) {
                r = mid - 1;
            } else if (power < num) {
                l = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
