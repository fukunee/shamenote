package solution2;

/**
 * @author lwc
 * @date 2019/11/12 20:00
 */
public class U154 {
    public int findMin(int[] nums) {
        int left = 0,right = nums.length-1;

        while(left <= right){
            int vLeft = nums[left];
            int vRight = nums[right];

            if(vLeft < vRight) return vLeft;
            if(right - left < 2) return Math.min(vLeft,vRight);
            int mid = (left + right) / 2;
            if(nums[mid] < nums[mid+1] && nums[mid] < nums[mid-1])
                return nums[mid];
            if(nums[mid] < nums[0]) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
