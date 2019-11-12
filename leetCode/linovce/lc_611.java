class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=nums.length-1;k>j;k--){
                    if(nums[i]+nums[j]>nums[k]){
                        n=k-j+n;
                        break;
                    }
                        
                }
            }
        }
        
        return n;
    }
}