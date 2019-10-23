import java.util.ArrayList;
import java.util.List;

public class lc_007 {
    public static void main(String[] args) {
        System.out.println(new Solution().reverse(123));
    }
    static class Solution {


        public int reverse(int x) {
            boolean b=false;
            if(x<0) {b=true;x=0-x;}
            if(x==0) return x;
            List<Integer> list= new ArrayList<>();
            int res=0;
            while(x>0)
            {
                int k=x%10;
                if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&k>7))return 0;
                res=res*10+k;
                x=x/10;
            }

            if(b)res=0-res;
            return res;

        }

    }
}
