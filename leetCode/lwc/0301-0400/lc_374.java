package leetcode;

/**
 * @author lwc
 * @date 2019/12/13 10:14
 */
public class lc_374 {
    static int c = 6;

    public int guessNumber(int n) {
        int left = 0, right = n;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int cur = guess(mid);
            if(cur == 0) return mid;
            if(cur < 0) right = mid - 1;
            else left = mid + 1;
        }
        return 0;
    }

    public int guess(int n){
        if(n > 6) return 1;
        if(n < 6) return -1;
        return 0;
    }
}
