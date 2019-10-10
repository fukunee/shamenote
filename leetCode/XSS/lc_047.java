import java.util.*;

public class lc_047 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int []nums=new int[]{1,1,2,2};
        Arrays.sort(nums);
        List<List<Integer>> list=solution.permuteUnique(nums);
        for(List<Integer> l:list)
        {
            System.out.println(l);
        }
    }
    static class Solution {
        public List<List<Integer>> list;
        //public Map<Integer,Boolean> used=new HashMap<>();
        public List<List<Integer>> permuteUnique(int[] nums) {
            list=new ArrayList<>();
            //used=new HashMap<>();
            fun(nums,0,nums.length-1);
            return list;
        }
        public void fun(int[] nums,int index,int end)
        {
            List<Integer> Curres=new ArrayList<>();
            if(index==end+1)
            {
                for(int i=0;i<nums.length;i++)
                {
                    Curres.add(nums[i]);
                }
                list.add(Curres);
                return;
            }
            Map<Integer,Boolean> used=new HashMap<>();
            for(int i=index;i<=end;i++)
            {
                boolean b1=used.get(nums[i])==null;
                if(b1) {
                    used.put(nums[i], true);
                    swap(nums, index, i);
                    fun(nums, index + 1, end);
                    swap(nums, index, i);
                    used.put(nums[i], false);
                }
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
