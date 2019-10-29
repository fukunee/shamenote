import java.util.*;
import java.util.stream.Collectors;

public class lc_015 {
    public static void main(String[] args) {
        int nums[]={0,0,0};
        System.out.print(new Solution().threeSum(nums));
    }
    //三数之和
    static class Solution
    {
        List<List<Integer>> res;
        //Set<List<Integer>> set;
        public List<List<Integer>> threeSum(int[] nums) {
            //set= new HashSet<>();
            //List<Integer> temp=new ArrayList<>();
            res=new ArrayList<>();
            Arrays.sort(nums);
            //func(nums,0,0,temp,0);
            for(int i=0;i<nums.length-2;i++)
            {
                if(i>0)
                {
                    if(nums[i]==nums[i-1])continue;
                }
                int l=i+1;
                int r=nums.length-1;
                while (l<r)
                {
                    if(nums[i]>0||nums[r]<0)break;
                    if(nums[i]+nums[l]+nums[r]==0)
                    {
                        List<Integer> temp=new ArrayList<>();
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
                    else if(nums[i]+nums[l]+nums[r]<0)l++;
                    else r--;
                }
            }
            /*
            for(List<Integer> list:res)
            {
                for(Integer i:list)
                {
                    System.out.print(i);
                    System.out.print("  ");
                }
                System.out.println();
            }*/
            //res=new ArrayList<>(set);
            return res;
        }
        /*
        public void func(int nums[],int index,int count,List<Integer>temp,int sum)
        {
            if(count==2)
            {
                int index1=findIndex(-sum,index,nums);
                if(index1!=-1)
                {
                    temp.add(nums[index1]);
                    Integer []temps=temp.toArray(new Integer[temp.size()]);
                    Arrays.sort(temps);
                    List<Integer> temp1=Arrays.stream(temps).collect(Collectors.toList());
                    boolean is_add=true;
                    for(List<Integer> temp2:set)
                    {
                        int count_1=0;
                        for (int i_t=0;i_t<3;i_t++)
                        {
                            if(temp2.get(i_t)==temp1.get(i_t))
                            {
                                count_1++;
                            }
                        }
                       if(count_1==3)
                       {
                           is_add=false;
                           break;
                       }
                    }
                    if(is_add)set.add(temp1);
                    temp.remove(2);
                }
                return;
            }
            for(int i=index;i<nums.length;i++)
            {
                temp.add(count,nums[i]);
                func(nums,i+1,count+1,temp,sum+nums[i]);
                temp.remove(count);
            }
        }*/
        public int findIndex(int n,int index,int []nums)
        {
            for(int i=index;i<nums.length;i++)
            {
                if(nums[i]==n)return i;
            }
            return -1;
        }
    }
}
