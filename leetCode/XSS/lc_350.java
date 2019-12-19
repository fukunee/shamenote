import javafx.beans.property.IntegerPropertyBase;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class lc_350 {
    public static void main(String[] args) {
        int res[]=new Solution().intersection(new int[]{1,2,2,1},new int[]{2,2,3,1});
        for(int i:res)
        {
            System.out.println(i);
        }
    }
    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map1 = new HashMap<>();
            for (int i : nums1)
            {
                if(map1.containsKey(i))
                {
                    map1.put(i,map1.get(i)+1);
                }
                else
                {
                    map1.put(i,1);
                }
            }
            List<Integer> list=new ArrayList<>();
            for(int i:nums2)
            {
                if(map1.containsKey(i)&&map1.get(i)>0)
                {
                    list.add(i);
                    map1.put(i,map1.get(i)-1);
                }
            }
            return list.stream().mapToInt(Integer::valueOf).toArray();
        }
    }
}
