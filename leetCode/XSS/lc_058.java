public class lc_058 {
    public static void main(String[] args) {
    //最后一个单词的长度，正常情况应该从后往前遍历字符串  **
    }
    static class Solution {
        public int lengthOfLastWord(String s) {
            if(s.length()==0)return 0;
            String ss[]=s.split(" ");
            if(ss.length==0)return 0;
            return ss[ss.length-1].length();
        }
    }
}
