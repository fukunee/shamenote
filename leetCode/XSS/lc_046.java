import java.util.ArrayList;
import java.util.List;

public class lc_046 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int []nums=new int[]{1,2,3};
        List<List<Integer>> list=solution.permute(nums);
        for(List<Integer> l:list)
        {
            System.out.println(l);
        }
    }
    static class Solution {
        public List<List<Integer>> list;
        public List<List<Integer>> permute(int[] nums) {
            list=new ArrayList<>();
            fun(nums,0,nums.length-1);
            return list;
        }
        public void fun(int[] nums,int index,int end)
        {
            List<Integer> Curres=new ArrayList<>();
            if(index==end)
            {
                for(int i=0;i<nums.length;i++)
                {
                    Curres.add(nums[i]);
                }
                list.add(Curres);
                return;
            }
            fun(nums,index+1,end);
            for(int i=index+1;i<=end;i++)
            {
                swap(nums, index, i);
                fun(nums, index + 1, end);
                swap(nums, index, i);

            }
        }
        public void swap(int []nums,int p1,int p2)
        {
            int temp=nums[p1];
            nums[p1]=nums[p2];
            nums[p2]=temp;

        }
    }
}
