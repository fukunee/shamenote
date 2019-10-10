import java.util.*;

public class lc_017 {
    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations("23"));
    }

    static class Solution {
        List<String> list;

        public List<String> letterCombinations(String digits) {
            int length = digits.length();
            list = new ArrayList<>();
            if (length == 0) return list;
            Deque<Character> queue = new LinkedList<>();
            fun(digits, 0, queue);
            return list;
        }

        public void fun(String s, int index, Deque<Character> q) {
            int l = s.length();
            if (q.size() == l) {
                String res = "";
                for (Character c : q) {
                    res += c;
                }
                list.add(res);
                return;
            }
            for (int i = index; i < l; i++) {
                String sc = nToc(s.charAt(i));
                for (int j = 0; j < sc.length(); j++) {

                    q.add(sc.charAt(j));
                    fun(s, i + 1, q);
                    q.pollLast();
                }

            }

        }

        public String nToc(char n) {
            switch (n) {
                case '2':
                    return "abc";
                case '3':
                    return "def";
                case '4':
                    return "ghi";
                case '5':
                    return "jkl";
                case '6':
                    return "mno";
                case '7':
                    return "pqrs";
                case '8':
                    return "tuv";
                case '9':
                    return "wxyz";
            }
            return "";
        }
    }
}