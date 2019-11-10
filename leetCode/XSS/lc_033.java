public class lc_033 {
    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[]{4,5,6,7,0,1,2},0));
    }
    static class Solution {
        public int search(int[] nums, int target) {
            int n=nums.length;
            if(n==0)return -1;
            int left=0,right=n-1;
            while (left<=right)
            {
                int mid=left + (right-left)/2;
                System.out.println(String.valueOf(right-left)+"/2="+String.valueOf((right-left)>>1));
                if(nums[mid]==target)return mid;
                if(nums[left]<=nums[mid])
                {
                    //前半部分有序
                    if(nums[mid]>target&&nums[left]<=target)
                    {
                        right=mid-1;
                    }
                    else
                    {
                        left=mid+1;
                    }
                }
                else
                {
                    //后半部分有序
                    if(nums[mid]<target&&nums[right]>=target)
                    {
                        left=mid+1;
                    }
                    else
                    {
                        right=mid-1;
                    }
                }
            }
            return -1;
        }
    }
}
