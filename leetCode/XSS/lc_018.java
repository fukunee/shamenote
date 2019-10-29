import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc_018 {
    public static void main(String[] args) {
//四数之和
        int []nums={1, 0, -1, 0, -2, 2};
        new Solution().fourSum(nums,0);
    }
    static class Solution {
        List<List<Integer>>res;
        public List<List<Integer>> fourSum(int[] nums, int target) {
            res=new ArrayList<>();
            Arrays.sort(nums);
            for(int i=0;i<nums.length-3;i++)
            {
                if(i>0)
                {
                    if(nums[i-1]==nums[i])continue;
                }
                int n=nums.length-1;
                if (nums[i]+nums[n-1]+nums[n-2]+nums[n-3]<target)continue;
                if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target)break;
                threeSum(nums,target-nums[i],i);
            }
            for(List<Integer> list:res)
            {
                for(Integer i:list)
                {
                    System.out.print(i);
                    System.out.print("  ");
                }
                System.out.println();
            }
            return res;
        }
        public void threeSum(int[] nums,int target,int origin) {
            for(int i=origin+1;i<nums.length-2;i++)
            {
                if(i>origin+1)
                {
                    if(nums[i]==nums[i-1])continue;
                }
                int n=nums.length;
                if (nums[origin]+nums[i]+nums[n-1]+nums[n-2]<target)continue;
                int l=i+1;
                int r=nums.length-1;
                if(nums[origin]+nums[i]+nums[i+1]+nums[i+2]>target)break;
                while (l<r)
                {
                    if(nums[i]+nums[l]+nums[r]==target)
                    {
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[origin]);
                        temp.add(nums[i]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);
                        res.add(temp);
                        l++;r--;
                        while(l<nums.length&&r>i)
                        {
                            if(l<nums.length&&nums[l]==nums[l-1])
                            {
                                l++;
                            }
                            else if(r>i&&nums[r]==nums[r+1])
                            {
                                r--;
                            }
                            else
                            {
                                break;
                            }
                        }
                    }
                    else if(nums[i]+nums[l]+nums[r]<target)l++;
                    else r--;
                }
            }
        }
    }
}
