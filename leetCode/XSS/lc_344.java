public class lc_344 {
    public static void main(String[] args) {
        char[]s={'1','2','3'};
        new Solution().reverseString(s);
        for(int i=0;i<s.length;i++)
        {
            System.out.print(s[i]);
        }
    }
    static class Solution{
        public void reverseString(char[] s) {
            if(s.length<=1)return;
            char temp;
            for(int i=0;i<s.length/2;i++)
            {
                temp=s[i];
                s[i]=s[s.length-1-i];
                s[s.length-1-i]=temp;
            }
        }
    }
}
