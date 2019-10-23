public class lc_917 {
    public static void main(String[] args) {
        System.out.print(new Solution().reverseOnlyLetters("ab-cd"));
    }
    static class Solution {
        public String reverseOnlyLetters(String S) {
            int l=0,len=S.length();
            if(len<=1) return S;
            char s[]=S.toCharArray();
            int r=len-1;
            while(l<r)
            {
                if(!isCharacter(s[l]))
                {
                    l++;
                    continue;
                }
                if(!isCharacter(s[r]))
                {
                    r--;
                    continue;
                }
                char temp=s[l];
                s[l]=s[r];
                s[r]=temp;
                l++;r--;
            }
            return new String(s);
        }
        public boolean isCharacter(char c)
        {
            return ((c>='a'&&c<='z')||(c>='A'&&c<='Z'));
        }
    }
}
