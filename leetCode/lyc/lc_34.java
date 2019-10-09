class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int []res=new int[2];
        if(n==0){
            res[0]=-1;
            res[1]=-1;
            return res;
        }
        res[0]=findleft(nums,target);
        res[1]=findright(nums,target);
        return res; 
    }
    public int findleft(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
           int mid=(left+right)>>>1;
            if((nums[mid]==target)&&(mid-1<0||nums[mid-1]!=target)){
                return mid;
            }else if(nums[mid]>=target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
     public int findright(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)>>>1;
            if(nums[mid]==target&&(mid+1>=nums.length||nums[mid+1]!=target)){
                return mid;
            }else if(nums[mid]<=target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}