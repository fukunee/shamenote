package solution2;

/**
 * @author lwc
 * @date 2019/11/12 20:27
 */
public class U155 {
    public int findMin(int[] nums) {
        return min(nums, 0, nums.length - 1);
    }

    public int min(int[] nums, int start, int end){
        int left = start, right = end;

        while(left <= right){
            int vLeft = nums[left];
            int vRight = nums[right];
            if(vLeft < vRight) return vLeft;


            int mid = (left + right) / 2;
            int medium = nums[mid];
            if(right - left < 2)
                return Math.min(vLeft,vRight);

            if(medium <= nums[mid+1] && medium < nums[mid-1])
                return medium;
            if(medium < nums[0]) right = mid - 1;
            else if(medium > nums[0]) left = mid + 1;
            else return Math.min(min(nums, start,mid - 1), min(nums, mid+1, end));
        }
        return -1;
    }
}
