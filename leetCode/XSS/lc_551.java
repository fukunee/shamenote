public class lc_551 {
    public static void main(String[] args) {


        System.out.println(new Solution().checkRecord("PPALL")?"true":"false");
    }
    static class Solution {
            public boolean checkRecord(String s) {
                if(s.length()==0) return false;
                int anum=0,lnum=0,i=0;
                while(i<s.length()&&anum<=1&&lnum<=2)
                {
                    switch (s.charAt(i))
                    {
                        case 'P':
                            lnum=0;
                            break;
                        case 'A':
                            anum++;
                            lnum=0;
                            break;
                        case 'L':
                            lnum++;
                            break;
                    }
                    i++;
                }
                if(i==s.length()&&lnum<=2&&anum<=1)
                {
                    return true;
                }
                return false;
            }
        }

}
