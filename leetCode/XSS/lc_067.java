public class lc_067 {
    public static void main(String[] args) {
        //二进制求和,使用该法会面临超过数字范围问题  **
        System.out.println(new Solution().twoTo10("1101"));
        System.out.println(new Solution().tenTo2(8));
        System.out.println(new Solution().addBinary("11","1"));
    }
    static class Solution {
        public String addBinary(String a, String b) {
            return tenTo2(twoTo10(a)+twoTo10(b));
        }
        public long twoTo10(String n)
        {
            long res=0;
            for(int i=0;i<n.length();i++)
            {
                res=res*2+(n.charAt(i)-'0');
            }
            return res;
        }
        public String tenTo2(long n)
        {
            StringBuilder res=new StringBuilder();
            if(n==0)return "0";
            while (n>0)
            {
                res.append(n%2);
                n=n/2;
            }
            res=res.reverse();
            return res.toString();
        }
        public String addBinary1(String a, String b) {
            StringBuilder ans = new StringBuilder();
            int ca = 0;
            for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0; i--, j--) {
                int sum = ca;
                sum += i >= 0 ? a.charAt(i) - '0' : 0;
                sum += j >= 0 ? b.charAt(j) - '0' : 0;
                ans.append(sum % 2);
                ca = sum / 2;
            }
            ans.append(ca == 1 ? ca : "");
            return ans.reverse().toString();
        }
    }
}
