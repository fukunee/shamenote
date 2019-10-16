public class lc_008 {
    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("-2147483647"));
    }
    static class Solution {
        public int myAtoi(String str) {
            if(str==null)return 0;
            str=str.trim();
            //str=str.replaceAll()
            int res=0;
            if(str.length()==0)return 0;
            if(str.charAt(0)=='+'||str.charAt(0)=='-')
            {
                String num="";
                boolean b=true;
                for(int i=1;i<str.length();i++)
                {
                    if(str.charAt(i)>='0'&&str.charAt(i)<='9')
                    {
                        if(str.charAt(0)=='+')
                        {
                            if(res<Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&str.charAt(i)-'0'<=7)) res=res*10+str.charAt(i)-'0';
                            else return Integer.MAX_VALUE;
                        }
                        else
                        {
                            if(res>Integer.MIN_VALUE/10||(res==Integer.MIN_VALUE/10&&str.charAt(i)-'0'<=8))res=res*10-(str.charAt(i)-'0');
                            else return Integer.MIN_VALUE;
                        }
                    }
                    else
                    {
                        break;
                    }
                }
                return res;
            }
            else if(str.charAt(0)>='0'&&str.charAt(0)<='9')
            {
                for(int i=0;i<str.length();i++)
                {
                    if(str.charAt(i)>='0'&&str.charAt(i)<='9')
                    {

                            if (res < Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' <= 7))
                                res = res * 10 + str.charAt(i) - '0';
                            else return Integer.MAX_VALUE;

                    }
                    else {
                        break;
                    }
                }
                return res;
            }
            else
            {
                return 0;
                /*
                int i=0;
                do {
                    i++;
                }
                while (i<str.length()&&!(str.charAt(i)>='0'&&str.charAt(i)<='9'));
                for(;i<str.length();i++)
                {
                    if(str.charAt(i)>='0'&&str.charAt(i)<='9')
                    {

                        if (res < Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' <= 7))
                            res = res * 10 + str.charAt(i) - '0';
                        else return Integer.MAX_VALUE;

                    }
                    else {
                        break;
                    }
                }
                return res;*/
            }

        }
    }
}
