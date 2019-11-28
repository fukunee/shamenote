package easy;
/*lc_942*/
public class DiStringMatch {
    public static void main(String[] args){
        Solution solution = new DiStringMatch().new Solution();
        String S = "IDID";
        System.out.print(solution.diStringMatch(S));

    }
    class Solution {
        public int[] diStringMatch(String S) {
            int min = 0;
            int max = S.length();
            int[] res = new int[S.length() + 1];
            S += S.charAt(max - 1);
            for(int i = 0;i < S.length();i++){
                if(S.charAt(i) == 'I'){
                    res[i] = min;
                    min++;
                }else if(S.charAt(i) == 'D'){
                    res[i] = max;
                    max--;
                }
            };

            return res;
        }
    }
}
