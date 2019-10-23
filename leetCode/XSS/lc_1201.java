public class lc_1201 {
    public static void main(String[] args) {
        new Solution().nthUglyNumber(5,2,11,13);
    }
    static class Solution {
        public int nthUglyNumber(int n, int a, int b, int c) {
            int a_b = __gcd(a, b);
            int b_c = __gcd(b, c);
            int a_c = __gcd(a, c);
            long ab = (long)a * b/a_b;
            long bc = (long)b * c/b_c;
            long ac = (long)a * c/a_c;
            long abc = (long)a * bc / __gcd((long)a, bc);
            int l = Math.min(Math.min(a, b), c);
            int r = Integer.MAX_VALUE;
            while (l < r) {
                int mid = l + (r-l)/2;
                int numA = mid /a;
                int numB = mid / b;
                int numC = mid / c;
                int numAB = (int) (mid / ab);
                int numAC = (int) (mid / ac);
                int numBC = (int) (mid / bc);
                int numABC = (int) (mid / abc);
                if (numA + numB + numC - numAB - numBC - numAC + numABC >= n) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            return l;
        }
        public int __gcd(long a1,long a2)
        {
            while (a1%a2!=0)
            {
                long temp=a1%a2;
                a1=a2;
                a2=temp;
            }
            return (int)a2;
        }
    }
}
