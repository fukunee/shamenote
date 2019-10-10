class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        if(target<nums[0]){
            return 0;
        }
        if(target>nums[n-1]){
            return n;
        }
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)>>>1;
            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                right=mid-1;
            }
            else{
               left=mid+1;
            }
        }
       return left;
        
    }
}