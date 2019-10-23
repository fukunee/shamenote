public class lc_665 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean checkPossibility(int[] nums)
        {
            int l=0,i=0,len=nums.length;
            if(len<3) return true;
            while (l<len-1&&i<2)
            {
                if(nums[l]<=nums[l+1])
                {
                }else
                {
                    i++;
                    if(l>0&&nums[l-1]>nums[l+1])
                    {
                        nums[l+1]=nums[l];
                    }
                }
                l++;
            }
            if(i<2) return true;
            return false;
        }
    }
}
