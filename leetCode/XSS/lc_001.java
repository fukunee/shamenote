import java.util.HashMap;
import java.util.Map;
//两数相加
public class lc_001 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map=new HashMap<>();
            int res[]=new int[2];
            for(int i=0;i<nums.length;i++)
            {
                map.put(nums[i],i);
            }
            for(int i=0;i<nums.length;i++)
            {
                if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i)
                {
                    res[0]=i;
                    res[1]=map.get(target-nums[i]);
                    return res;
                }
            }
            return res;
        }
    }
}
