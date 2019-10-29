public class lc_014 {
    public static void main(String[] args) {
//最长公共前缀
    }
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            int min_len=Integer.MAX_VALUE;
            for(int i=0;i<strs.length;i++)
            {
                min_len=Math.min(min_len,strs[i].length());
            }
            if(min_len==0||strs.length==0)return "";
            boolean b=true;int i=0;String res="";
            while(b&&i<min_len)
            {
                Character temp=strs[0].charAt(i);
                for(int j=1;j<strs.length;j++)
                {
                    if(strs[j].charAt(i)!=temp)
                    {
                        b=false;
                        break;
                    }
                }
                if(b)
                {
                    res+=temp;
                }
                i++;
            }
            return res;
        }
    }
}
