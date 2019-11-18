package easy;

import java.util.ArrayList;
import java.util.List;
/*lc_821*/
public class ShortestToChar {
    public static void main(String[] args){
        Solution solution = new ShortestToChar().new Solution();
        String S = "loveleetcode";
        char C = 'e';
        System.out.print(solution.shortestToChar(S,C));
    }
    class Solution {
        /*方法一*/
        /*public int[] shortestToChar(String S, char C) {
            int[] res = new int[S.length()];
            if(S.length() == 0){
                return res;
            }
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i<S.length();i++){
                if(S.charAt(i) == C){
                    res[i] = 0;
                    list.add(i);
                }
            }
            for(int j = 0; j < S.length();j++){
                if(S.charAt(j) != C){
                    res[j] = getmin(list,j);
                }
            }
            return res;
        }
        public int getmin(List<Integer> min,int p){
            int res = Integer.MAX_VALUE;
            for(int num : min){
                res = Math.min(res,Math.abs(num - p));
            }
            return  res;
        }*/
        /*方法二*/
        public int[] shortestToChar(String S, char C){
            int[] res = new int[S.length()];
            int[]left = new int[S.length()];
            int[]right = new int[S.length()];
            left[0] = S.charAt(0) == C ? 0 : Integer.MAX_VALUE;
            for(int i = 1;i < S.length();i++){
                left[i] = S.charAt(i) == C? 0 : left[i - 1] + 1;
            }
            right[S.length() - 1] = S.charAt(S.length() - 1) == C ? 0 : Integer.MAX_VALUE;
            for(int i = S.length() - 2;i >= 0;i--){
                right[i] = S.charAt(i) == C? 0 : right[i + 1] + 1;
            }
            for(int i = 0;i<S.length();i++){
                res[i] = Math.min(left[i],right[i]);
            }
            return res;
        }
    }
}
