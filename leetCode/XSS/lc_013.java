public class lc_013 {
    public static void main(String[] args) {
//罗马数字转整数
    }
    static class Solution {
        private Character []roman={'I','V','X','L','C','D','M'};

        public int romanToInt(String s) {

            int []number={1,5,10,50,100,500,1000};
            int pre=-1,res=0;
            for(int i=0;i<s.length();i++)
            {
                if(pre==-1)pre=findIndex(s.charAt(i));
                if(pre>=findIndex(s.charAt(i)))res+=number[findIndex(s.charAt(i))];
                else{
                    res=res+number[findIndex(s.charAt(i))]-2*number[pre];
                }
                pre=findIndex(s.charAt(i));
            }
            return res;
        }
        public int findIndex(Character c)
        {
            for(int i=0;i<roman.length;i++)
            {
                if(c==roman[i])return i;
            }
            return -1;
        }
    }
}
