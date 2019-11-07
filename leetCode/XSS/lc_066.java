public class lc_066 {
    public static void main(String[] args) {
//加1，*
    }
    static class Solution {
        public int[] plusOne(int[] digits) {
            for(int i=digits.length-1;i>=0;i--)
            {
                if(digits[i]+1>=10)
                {
                    digits[i]=digits[i]+1-10;
                }
                else
                {
                    digits[i]=digits[i]+1;
                    return digits;
                }
            }
            int res[]=new int[digits.length+1];
            res[0]=1;res[1]=0;
            for(int i=1;i<digits.length;i++)
            {
                res[i+1]=digits[i];
            }
            return res;
        }
    }

}
