import java.util.Arrays;

public class lc_031 {
    public static void main(String[] args) {
        int nums[]=new int[]{3,2,1,4};
        new Solution().nextPermutation(nums);
    }
    static class Solution {
        public void nextPermutation(int[] nums) {
            int end=nums.length-1;
            int a=-1;int b=-1;
            for(int i=end-1;i>=0;i--)
            {
                if(nums[i]<nums[i+1])
                {
                    a=i;
                    break;
                }
            }
            if(a!=-1)
            {
                for(int i=end;i>a;i--)
                {
                    if(nums[i]>nums[a])
                    {
                        b=i;
                        break;
                    }
                }
                int temp=nums[a];
                nums[a]=nums[b];
                nums[b]=temp;
                reverse(nums,a+1,nums.length-1);
            }
            else
            {
                reverse(nums,0,nums.length-1);
            }
            for(int i=0;i<nums.length;i++)
            {
            System.out.print(nums[i]);}

        }
        public void reverse(int n[],int start,int end)
        {
            int len=end-start;
            for(int i=0;i<=len/2;i++)
            {
                int temp=n[i+start];
                n[i+start]=n[end-i];
                n[end-i]=temp;
            }
        }
    }
}
