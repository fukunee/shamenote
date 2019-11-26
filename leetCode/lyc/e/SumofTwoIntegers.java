package easy;
/*lc_371*/
public class SumofTwoIntegers {
    public static void main(String[] args){
        Solution solution = new SumofTwoIntegers().new Solution();
        int a = 2;
        int b = 3;
        System.out.print(solution.getSum(a,b));
    }
    class Solution {
        public int getSum(int a, int b) {
            if(a == 0 && b == 0){
                return a == 0 ? b : a ;
            }
            int res = a ^ b;
            int upnum = (a & b) << 1;
            if(upnum != 0){
                return getSum(res,upnum);
            }
            return res;
        }
    }
}
