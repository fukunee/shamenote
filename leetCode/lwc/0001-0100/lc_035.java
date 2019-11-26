package solution2;

public class U35 {
    public int searchInsert(int[] nums, int target) {
        int start = 0,end = nums.length,mid = 0;
        while(start < end){
            mid = (start+end)/2;
            if(target == nums[mid]) return mid;
            if(target > nums[mid]) start = mid + 1;
            if(target < nums[mid]) end = mid;
        }

        if(target < nums[mid]) return mid;
        else return mid + 1;
    }
}
