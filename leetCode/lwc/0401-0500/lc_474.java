package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lwc
 * @date 2020/4/16 15:07
 */
public class lc_474 {
    public int findMaxForm(String[] strs, int m, int n) {
        //List<String> list = new ArrayList<>(Arrays.asList(strs));
        LinkedList<int[]> list = new LinkedList<>();
        int[][][] u = new int[m+1][n+1][strs.length];
        for(String str : strs){
            int a = 0; int b = 0;
            for(char c : str.toCharArray()){
                if(c == '0') a++;
                else b++;
            }
            list.add(new int[]{a, b});
        }
        return help(list, m, n, u, 0);
    }

    public int help(LinkedList<int[]> list, int m, int n, int[][][] u, int level){
        if(list.size() == 0) return 0;
        if(u[m][n][level] != 0) return u[m][n][level];
        //第一种方案，当前字符串不选择
        int[] v = list.remove(0);
        int val = help(list, m, n, u, level+1);
        list.add(0, v);

        //第二种方案，选择当前字符串，同时注意判断m,n的数量
        if(m >= v[0] && n >= v[1]){
            list.remove(0);
            val = Math.max(val, 1 + help(list, m-v[0], n-v[1], u, level+1));
            list.add(0,v);
        }
        u[m][n][level] = val;
        return val;
    }
}
