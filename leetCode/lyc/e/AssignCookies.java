package easy;

import java.util.Arrays;
/*lc_455*/
public class AssignCookies {
    public static void  main(String[] args){
        Solution solution = new AssignCookies().new Solution();
        int[] g = new int[]{1,2,3,4};
        int[] s = new int[]{1,2,5,6};
        System.out.print(solution.findContentChildren(g,s));
    }
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int res = 0;
            int i = 0;
            int j = 0;
            while(i < g.length && j<s.length){
                if(s[j] >= g[i]){
                    res++;
                    i++;
                }
                j++;
            }
            return  res;
        }
    }
}
