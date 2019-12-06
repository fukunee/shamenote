public class lc_169 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int majorityElement(int[] nums) {
            int res=-1;int count=0;
            for(int i:nums)
            {
                if(res==i)
                {
                    count++;
                }
                else if(count>0)
                {
                    count--;
                }
                if(count==0)
                {
                    count++;
                    res=i;
                }
            }
            return res;
        }
    }
}
