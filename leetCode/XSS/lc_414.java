public class lc_414 {
    public static void main(String[] args) {
        int nums[]=new int[]{1,2,2,5,3,5};
        System.out.println(new Solution().thirdMax(nums));
    }
    static class Solution {
        public int thirdMax(int[] nums) {
            int l=nums.length;
            int res=Integer.MIN_VALUE;
            if(l<3)
            {
                res=Integer.MIN_VALUE;
                for(int i=0;i<l;i++)
                {
                    if(res<nums[i]) res=nums[i];
                }
            }
            else
            {
                boolean b=false;
                int max1=Integer.MIN_VALUE,max2=max1+1,max3=max2+1;
                for(int i=0;i<l;i++)
                {
                    if(nums[i]>max1)
                    {
                        max3=max2;
                        max2=max1;
                        max1=nums[i];
                    }
                    else if(nums[i]>max2&&nums[i]!=max1)
                    {
                        max3=max2;
                        max2=nums[i];
                    }
                    else if(nums[i]>max3&&nums[i]!=max2&&nums[i]!=max1)
                    {
                        max3=nums[i];
                        b=true;
                    }
                }
                if(b==false)
                {
                    res=max1;
                }
                else
                {
                    res=max3;
                }
            }
            return res;
        }
    }
}
