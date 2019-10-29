/*3Sum Closest*/
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int tag=nums[i]+nums[j]+nums[k];
                int flag=Math.abs(tag-target);
                if(flag<res){
                    close=tag;
                    res=flag;
                }
                if(tag>target){
                    k--;
                }
                if(tag<target){
                    j++;
                }
                if(tag==target){
                    return target;
                }
            }
        }
        return close;
    }
}