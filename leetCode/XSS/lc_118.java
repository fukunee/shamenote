import java.util.ArrayList;
import java.util.List;

public class lc_118 {
    public static void main(String[] args) {
        //杨辉三角
    }
    public static class TreeNode {
        int val;
        TreeNode leftp;
        TreeNode rightp;
        //TreeNode parent;
        TreeNode next;
    }
    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<Integer> pre=new ArrayList<>();
            List<Integer> now=new ArrayList<>();
            List<List<Integer>> res=new ArrayList<>();
            pre.add(1);
            res.add(pre);
            //pre=new ArrayList<>();
            for(int i=2;i<=numRows;i++)
            {
                for(int j=0;j<i;j++)
                {
                    int val=0;
                    if(j-1>=0)val+=pre.get(j-1);
                    if(j<pre.size())val+=pre.get(j);
                    now.add(val);
                }
                pre=now;
                res.add(now);
                now=new ArrayList<>();
            }
            return res;
        }
    }
}
