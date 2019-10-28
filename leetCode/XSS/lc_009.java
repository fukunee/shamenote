public class lc_009 {
    public static void main(String[] args) {

    }
    //回文数  121 1 12   12      1
    class Solution {
        public boolean isPalindrome(int x) {
            if(x<0)return false;
            int reverNumber=0;
            while (x>reverNumber)
            {
                reverNumber=reverNumber*10+x%10;
                x=x/10;
            }
            return x==reverNumber||x==reverNumber/10;
        }
    }
}
