package leetcode;

import java.util.HashMap;

/**
 * @author lwc
 * @date 2019/11/27 10:10
 */
public class lc_278 {
    public int firstBadVersion(int n) {
        int left = 0,right = n;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid) == false)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

    public boolean isBadVersion(int n){
        return true;
    }
}
