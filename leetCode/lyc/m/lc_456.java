/*132 Pattern*/
class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length; 
        if(n<3){
            return false;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            if(min==nums[i]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(min<nums[j]&&nums[j]<nums[i]){
                    return true;
                }
            }
        }
        return false;
    }
}