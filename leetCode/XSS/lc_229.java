import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc_229 {
    public static void main(String[] args) {
        System.out.print(new Solution().majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
    static class Solution {
        public List<Integer> majorityElement(int[] nums) {
            Set<Integer> set=new HashSet<>();
            int k=nums.length/3;
            int res1=-1,res2=-1;
             double t1=0,t2=0;
            for(int i=0;i<nums.length;i++)
            {
                boolean b=false;
                if(res1==-1&&nums[i]!=res2)
                {
                    res1=nums[i];
                    t1=+1;
                    b=true;
                }
                else
                {
                    if(res1==nums[i])
                    {
                        t1+=1;
                        b=true;
                    }
                    else
                    {
                        t1-=0.5;
                        if(t1<=0)
                        {
                            res1=-1;
                            t1=0;
                        }
                    }
                }

                if(res2==-1&&!b&&nums[i]!=res1)
                {
                    res2=nums[i];
                    t2+=1;
                }
                else
                {
                    if(res2==nums[i])
                    {
                        t2+=1;
                    }
                    else
                    {
                        t2-=0.5;
                        if(t2<=0)
                        {
                            res2=-1;
                            t2=0;
                        }
                    }
                }
            }
            if(t1>0&&check(nums,k,res1))
            {

                set.add(res1);
            }
            if(t2>0&&check(nums,k,res2))
            {
                set.add(res2);
            }
            return new ArrayList<>(set);
        }
        public boolean check(int nums[],int k,int a)
        {
            int t=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==a)
                {
                    t++;
                }
            }
            return t>k;
        }
    }

}
