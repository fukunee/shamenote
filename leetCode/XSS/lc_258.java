public class lc_258 {
    public static void main(String[] args) {
    //各位相加
    }
    static class Solution {
        public int addDigits(int num) {

            int  a=add(num);
            if(a<10) return a;
            else return addDigits(a);
        }
        public int add(int num)
        {
            int res=0;
            while (num!=0)
            {
                res=res+num%10;
                num=num/10;
            }
            return res;
        }
    }
}
