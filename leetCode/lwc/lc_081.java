package solution2;

/**
 * @author lwc
 * @date 2019/10/20 0:11
 */
public class U81 {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        if(target == nums[0]) return true;
        return search(nums,target,0,nums.length);
    }

    public boolean search(int[] nums, int target, int l, int r){
        while(l < r){
            int mid = (l + r) / 2;
            if(target == nums[mid]) return true;
            if(nums[mid] == nums[0])
                return search(nums,target,l,mid) || search(nums,target,mid+1,r);
            int num = nums[mid] > nums[0] == target > nums[0] ?
                    nums[mid] : target > nums[0] ?
                    Integer.MAX_VALUE : Integer.MIN_VALUE;
            if(target > num) l = mid + 1;
            if(target < num) r = mid;
        }
        return false;
    }
}
