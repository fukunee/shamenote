public class lc_202 {
    public static void main(String[] args) {
        //快乐数
    }
    static class Solution {
        public boolean isHappy(int n) {
            int fast=n,slow=n;
            do{
                fast=squrtHappy(fast);
                fast=squrtHappy(fast);
                slow=squrtHappy(slow);
            }while (fast!=slow);
            if(fast==1)return true;
            return false;
        }
        public int squrtHappy(int n)
        {
            int res=0;
            while (n!=0)
            {
                int c=n%10;
                n=n/10;
                res=res+c*c;
            }
            return res;
        }
    }
}
