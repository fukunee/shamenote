import java.util.Arrays;

public class lc_016 {
    public static void main(String[] args) {
//最接近的三数之和
    }
    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            int min=Integer.MAX_VALUE,res=Integer.MAX_VALUE;
            Arrays.sort(nums);
            for(int i=0;i<nums.length-2;i++)
            {
                int l=i+1,r=nums.length-1;
                while (l<r)
                {
                    int sum=nums[i]+nums[l]+nums[r];
                    int abs=Math.abs(target-sum);
                    if(abs<min) {
                        min = abs;
                        res=sum;
                    }
                    if(sum==target)return res;
                    if(sum>target)r--;
                    if(sum<target)l++;
                }
            }
            return res;
        }
    }
}
