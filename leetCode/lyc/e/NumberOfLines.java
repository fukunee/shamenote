package easy;
/*lc_806*/
public class NumberOfLines {
    public static void main(String[] args){
        Solution solution = new NumberOfLines().new Solution();
        int[] widths = new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String S = "abcdefghijklmnopqrstuvwxyz";
        System.out.print(solution.numberOfLines(widths,S));
    }
    class Solution {
        public int[] numberOfLines(int[] widths, String S) {
            int[] res = new int[2];
            if(S.length() == 0){
                return  res;
            }

            int temp = 0;
            res[0] = 1;
            for (char c : S.toCharArray()){

                if(temp + widths[c - 'a'] <= 100){
                    temp += widths[c - 'a'];
                }else {
                    res[0]++;
                    temp = widths[c - 'a'];
                }
            }
            res[1] = temp;
            return res;
        }
    }
}
