import java.util.ArrayList;
import java.util.List;

public class lc_022 {
    public static void main(String[] args) {
//括号生成
    }
    static class Solution {
        List<String> res;
        public List<String> generateParenthesis(int n) {
            int len=2*n;
            res=new ArrayList<>();
            StringBuilder str=new StringBuilder();
            fun(len,0,0,0,str);
            return res;

        }
        public void fun(int n,int left,int right,int index,StringBuilder str)
        {
            int num=n/2;
            if(n==index)
            {
                String temp=str.toString();
                res.add(temp);
                return;
            }
            if(index==0)
            {
                str.append('(');
                fun(n,1,0,1,str);
                str.deleteCharAt(str.length()-1);
            }
            else if(left==num)
            {
                str.append(')');
                fun(n,left,right+1,index+1,str);
                str.deleteCharAt(str.length()-1);
            }
            else if(left>0&&left<num)
            {
                str.append('(');
                fun(n,left+1,right,index+1,str);
                str.deleteCharAt(str.length()-1);
                if(right<left)
                {
                    str.append(')');
                    fun(n,left,right+1,index+1,str);
                    str.deleteCharAt(str.length()-1);
                }
            }
        }
    }
}
