import java.util.ArrayList;
import java.util.List;

public class lc_093 {
    public static void main(String[] args) {
        new Solution().restoreIpAddresses("25525511135");
    }
    static class Solution {
        public List<String> restoreIpAddresses(String s) {
            int len=s.length();
            List<String>res=new ArrayList<>();
            String ss[]=new String[4];
            fun(s,0,res,ss,0);
            return res;
        }
        public void fun(String s,int index,List<String> res,String ss[],int sindex)
        {
            if(sindex==4)
            {
                if(index==s.length()) {
                    res.add(ss[0] + "." + ss[1] + "." + ss[2] + "." + ss[3]);
                    System.out.println(ss[0] + "." + ss[1] + "." + ss[2] + "." + ss[3]);
                }
                else return;
            }
                for (int j = 1; j <= 3; j++) {
                    if(index+j<=s.length()) {
                        ss[sindex] = s.substring(index, index + j);
                        if (Integer.parseInt(ss[sindex]) <= 255&&(ss[sindex].length()==1||ss[sindex].charAt(0)!='0')) {
                            fun(s, index + j, res, ss, sindex + 1);
                        }
                    }
                    else break;
                }
        }
    }
}
