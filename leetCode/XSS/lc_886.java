import com.sun.xml.internal.ws.util.StringUtils;

public class lc_886 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int primePalindrome(int N) {
            if(N<=2)N=2;
            for(int i=N;i<=Integer.MAX_VALUE;i++)
            {
                String s= String.valueOf(i);
                int l=0,r=s.length()-1;boolean b=true;
                while(l<r)
                {
                    if(s.charAt(l)==s.charAt(r))
                    {
                        l++;r--;
                    }
                    else
                    {
                        b=false;
                        break;
                    }
                }
                if(l>=r)
                {
                    for(int j=2;j*j<=i;j++)
                    {
                        if(i%j==0) {
                            b=false;
                            break;
                        }
                    }
                }
                if(b)return i;
            }
            return -1;
        }
    }
}
