/* Remove Duplicates from Sorted Array*/
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int res=0;
        for(int i=1;i<nums.length;i++){
            if(nums[res]!=nums[i]){
                nums[++res]=nums[i];
            }
        }
        return res+1;
    }
}