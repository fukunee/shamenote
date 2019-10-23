import java.util.HashMap;
import java.util.Map;

public class lc_219 {
    public static void main(String[] args) {
        System.out.println(String.valueOf(new Solution().containsNearbyDuplicate(new int[]{1,0,1,1},1)));
    }
    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++)
            {
                if(map.get(nums[i])==null)
                {
                    map.put(nums[i],i);
                }
                else if(map.get(nums[i])!=null)
                {
                    if(i-map.get(nums[i])<=k)
                    {
                        return true;
                    }
                    else
                    {
                        map.put(nums[i],i);
                    }
                }
            }
            return false;
        }
    }
}
