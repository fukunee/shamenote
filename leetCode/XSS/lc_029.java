public class lc_029 {
    public static void main(String[] args) {

    }
    class Solution
    {
        public int divide(int dividend, int divisor) {
            if(divisor==0) return 0;
            long div1=dividend,div2=divisor;
            if(divisor==-1&&dividend==Integer.MIN_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            if(divisor<0)
            {
                div2=0-div2;
            }
            if(dividend<0)
            {
                div1=0-div1;
            }
            int res=0;
            for(int i=31;i>=0;i--)
            {
                if(div1>>i>div2)
                {
                    res+=1<<i;
                    div1-=div2<<i;
                }
            }
            if((dividend>0&&divisor<0)||(dividend<0&&divisor>0))
            {
                res=0-res;
            }
            return res;
        }
    }
}
