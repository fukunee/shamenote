package solution2;

/**
 * @author lwc
 * @date 2019/11/12 22:02
 */
public class U162 {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            if(right - left < 2)
                return nums[left] < nums[right] ? right : left;
            int mid = (left + right) / 2;
            if(nums[mid - 1] > nums[mid])right = mid - 1;
            else if(nums[mid+1] > nums[mid]) left = mid + 1;
            else return mid;
        }
        return -1;
    }
}
