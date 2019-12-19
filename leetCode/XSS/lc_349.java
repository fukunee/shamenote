import java.util.HashSet;

public class lc_349 {
    public static void main(String[] args) {
        //两个数组的交集
    }
    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set1=new HashSet<>();
            HashSet<Integer> set2=new HashSet<>();
            for(int i1:nums1)set1.add(i1);
            for(int i2:nums2)set2.add(i2);
            set1.retainAll(set2);
            int res[]=new int[set1.size()];
            int i=0;
            for(int s:set1){res[i++]=s;}
            return res;
        }
    }
}
