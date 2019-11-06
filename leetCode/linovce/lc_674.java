class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0)
            return 0;
        int max=1;
        int n=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
                n++;
            else {
                if(max<n)
                    max=n;
                n=1;
                if(max>nums.length/2+1)
                    break;
            }
        }
        if(max<n)
            max=n;
        return max;
    }
}