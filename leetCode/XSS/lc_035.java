public class lc_035 {
    public static void main(String[] args) {
        //搜索插入位置  **
        System.out.println(new Solution().searchInsert(new int[]{1,3,5,7},0));
    }
    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int n=nums.length;
            int left=0,right=n-1;
            int mid=-1;
            if(n<=0)return 0;
            //if(target<nums[0])return 0;
            //if(target>nums[n-1])return n;
            while(left<=right)
            {
                mid=(left+right)/2;
                if(nums[mid]==target)return mid;
                if(nums[mid]>target) right=mid-1;
                if(nums[mid]<target) left=mid+1;
            }

            return left;
        }
    }
}
