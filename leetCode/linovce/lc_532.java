class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length<2)
            return 0;
        Arrays.sort(nums);
        int n=0;
        int last = nums[0]/2+3;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==last){
                continue;
            }
            last=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i]==k){
                    n++;
                    break;
                }else if(nums[j]-nums[i]>k){
                    break;
                }
                    
            }
        }
        
        return n;
    }
}