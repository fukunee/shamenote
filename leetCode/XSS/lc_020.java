import java.util.Stack;

public class lc_020 {
    public static void main(String[] args) {
        //有效的括号
        System.out.print(new Solution().isValid("()"));
    }
    static class Solution {
        public boolean isValid(String s) {
            if(s.equals("")||s==null)return  true;
            Stack<Character> sc=new Stack<>();
            for(int i=0;i<s.length();i++)
            {
                Character c=s.charAt(i);
                if(c=='('||c=='{'||c=='[')
                {
                    sc.push(c);
                }
                else if(c==')'||c=='}'||c==']')
                {
                    Character temp=' ';
                    if(sc.empty()) return false;
                    else temp=sc.pop();
                    if(temp=='('&&c==')')
                    {
                        continue;
                    }
                    else if (temp=='{'&&c=='}')continue;
                    else if (temp=='['&&c==']')continue;
                    else
                    {
                        return false;
                    }
                }
            }
            if(sc.empty()) return true;
            return false;
        }
    }
}
