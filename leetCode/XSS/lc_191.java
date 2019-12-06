public class lc_191 {
    public static void main(String[] args) {
        //位1的个数
    }
    static class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int count=0;
            for(int i=0;i<32;i++)
            {
                int temp=n&1;
                if(temp==1)count++;
                n=n>>1;
            }
            return count;
        }
    }
}
