package leetcode;

import java.util.Arrays;

/**
 * @author lwc
 * @date 2019/12/3 11:27
 */
public class lc_324 {
    public void wiggleSort(int[] nums) {
        int len = nums.length;
        int[] p = new int[len];
        find(0, len - 1, len / 2, nums);
        int left = (len + 1) / 2 - 1 , right = len - 1;
        for(int i = 0; i + 1 < len; i = i + 2){
            p[i] = nums[left--];
            p[i+1] = nums[right--];
        }
        if(len % 2 == 1) p[len - 1] = nums[0];
        for(int j = 0; j < nums.length; j++){
            nums[j] = p[j];
        }
    }

    //left指针先走，还是right指针先走取决于所选的参考目标。这里我们选择left作为参考目标，right指针先走
    public void find(int start, int end, int target, int[] v){
        int refer = start;
        int left = start, right = end;
        while(left < right) {
            while (left < right && v[right] > v[refer]) right--;
            while (left < right && v[left] <= v[refer]) left++;
            swap(left, right, v);
        }
        int curL = left;
        while(curL > refer && v[curL] == v[refer]) curL--;
        swap(curL, refer, v);
        if(target >= curL && target <= left) return;
        if(target > left) find(left + 1, end, target, v);
        else find(start, curL - 1, target, v);

    }
    public void swap(int v1, int v2, int[] v){
        int temp = v[v1];
        v[v1] = v[v2];
        v[v2] = temp;
    }

}
