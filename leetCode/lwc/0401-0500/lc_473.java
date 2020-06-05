package leetcode;

import com.sun.org.apache.xerces.internal.util.XMLEntityDescriptionImpl;

import java.util.*;

/**
 * @author lwc
 * @date 2020/3/17 18:22
 */
public class lc_473 {
    public boolean makesquare(int[] nums) {
        if(nums.length == 0) {
            return false;
        }
        int total = 0;
        List<Integer> list = new ArrayList();
        for(int num : nums){
            binaryInsert(list,num);
            total += num;
        }
        if(total % 4 != 0) return false;
        for(int i = 4; i > 0; i--){
            int max = list.remove(0);
            if(!help(list, total/4 - max))
                return false;
        }
        return true;
    }

    public boolean help(List<Integer> list, int cur){
        if(cur == 0) return true;
        if(cur < 0) return false;
        for(int i = 0; i < list.size(); i++){
            int temp = list.remove(i);
            if(help(list, cur - temp))
                return true;
            list.add(i,temp);
        }
        return false;
    }

    public void binaryInsert(List<Integer> list, int target){
        int left = 0;
        int right = list.size();
        while(left < right){
            int mid = left + (right - left) / 2;
            int val = list.get(mid);
            if(val == target) {
                left = mid + 1;
                break;
            }
            if(val < target) right = mid;
            else left = mid + 1;
        }
        list.add(left, target);
    }
}
