package solution2;

public class U34 {
    public int[] searchRange(int[] nums, int target) {
        int min = -1; int max = -1;
        int rs = binarySearch(nums,0,nums.length,target);
        if(rs == -1) return new int[] {-1,-1};
        else{
            min = max = rs;
            while(min>=0 && nums[min] == nums[rs]) min--;
            while(max<nums.length && nums[max] == nums[rs]) max++;
            return new int[]{++min,--max};
        }
    }

    public int binarySearch(int[]nums,int start,int end,int target){
        while(start < end){
            int mid = (start+end)/2;
            if(target == nums[mid]) return mid;
            else if(target > nums[mid]) start = mid+1;
            else end = mid;
        }
        return -1;
    }


}
