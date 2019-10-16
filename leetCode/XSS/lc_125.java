public class lc_125 {
    public static void main(String[] args) {
        System.out.print(new Solution().isPalindrome("abcCbA("));
    }
    static class Solution
    {
        public boolean isPalindrome(String s) {
            int len=s.length();
            s=s.toLowerCase();
            int l=0,r=len-1;
            while(l<r)
            {
                if(!isC(s.charAt(l)))
                {
                    l++;continue;
                }
                if(!isC(s.charAt(r)))
                {
                    r--;continue;
                }
                if(s.charAt(l)!=s.charAt(r))
                {
                    return false;
                }
                else
                {
                    l++;r--;
                }

            }
            return true;
        }
        public boolean isC(char c)
        {
            if((c>='0'&&c<='9')||(c>='a'&&c<='z')||(c>='A'&&c<='Z'))
            {
                return true;
            }
            return false;
        }
    }
}
