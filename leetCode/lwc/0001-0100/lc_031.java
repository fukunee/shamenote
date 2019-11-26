package solution2;

import java.util.Arrays;

public class U31 {
    public void nextPermutation(int[] nums) {
        if(nums.length<2) return;
        int i = nums.length-2;
        while(i >= 0 && nums[i]>nums[i+1]) i--;
        if(i >= 0){
            int j = nums.length-1;
            while(nums[i] >= nums[j]) j--;
            swap(nums,i,j);
        }
        Arrays.sort(nums,i+1,nums.length);
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
