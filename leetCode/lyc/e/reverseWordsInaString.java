package easy;
/*lc_557*/
public class reverseWordsInaString {
    public static void main(String[] args){
        Solution solution = new reverseWordsInaString().new Solution();
        String s = "Let's take LeetCode contest";
        System.out.print(solution.reverseWords(s));
    }
    class Solution {
        public String reverseWords(String s) {
            if(s.length() == 0){
                return s;
            }
            String[] str = s.split(" ");
            StringBuilder res = new StringBuilder();
            for(int i = 0;i < str.length - 1;i++){
                StringBuilder sb = new StringBuilder(str[i]);
                sb.reverse();
                res.append(sb.toString());
                res.append(" ");
            }
            StringBuilder tag = new StringBuilder(str[str.length - 1]);
            res.append(tag.reverse().toString());

            return res.toString();
        }
    }
}
