import java.util.HashMap;
import java.util.HashSet;

public class lc_038 {
    public static void main(String[] args) {
        //**
        new Solution().countAndSay(30);
    }
    static class Solution {
        public String countAndSay(int n) {
            if(n<1)return "";
            StringBuilder orgin=new StringBuilder("1");
            if(n==1)return "1";
            for(int i=2;i<=n;i++)
            {
                char prevalue='0';int count=0;StringBuilder s=new StringBuilder();
                for(int j=0;j<orgin.length();j++)
                {
                    char c=orgin.charAt(j);
                    //int value=c-'0';
                    if(prevalue=='0')
                    {
                        prevalue=c;count++;
                    }
                    else if(c!=prevalue&&prevalue!=-1)
                    {
                        s=s.append(count).append(prevalue);
                        count=1;
                        prevalue=c;
                    }
                    else if(prevalue!=-1&&c==prevalue)
                    {
                        count++;
                    }

                    if(j==orgin.length()-1)
                    {
                        s=s.append(count).append(prevalue);
                    }
                }
                orgin=s;
                //System.out.println(orgin);
            }
            return orgin.toString();
        }
    }
}
