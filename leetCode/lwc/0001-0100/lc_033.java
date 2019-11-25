package solution2;

public class U33 {
    public int search(int[] nums, int target) {
        int l = 0,r = nums.length;
        while(l < r){
            int m = (r - l) / 2 + l;
            if (target == nums[m]) return m;
            else if (target > nums[m]) {
                if (nums[m] >= nums[l]) l = m + 1;
                else {
                    if(target > nums[l]) r = m;
                    else if(target == nums[l]) return l;
                    else l = m+1;
                }
            } else {
                if(nums[m] >= nums[l]){
                    if(target < nums[l]) l = m + 1;
                    else if(target == nums[l]) return l;
                    else return binarySearch(nums,l,m,target);
                }
                else{
                    r = m;
                }
            }

        }
        return -1;
    }

    public int binarySearch(int[] nums,int l,int r,int target){
        while(l < r){
            int mid = (r-l)/2+l;
            if(target == nums[mid]) return mid;
            if(target > nums[mid]) l = mid+1;
            if(target < nums[mid]) r = mid;
        }

        return -1;
    }


}
