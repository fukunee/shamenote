package easy;
/*lc_551*/
public class CheckRecord {
    public static void main(String[] args){
        Solution solution = new CheckRecord().new Solution();
        String s = "PPALLPLLL";
        System.out.print(solution.checkRecord(s));
    }
    class Solution {
        public boolean checkRecord(String s) {
            if(s.length() == 0){
                return true;
            }
            char[] chars = s.toCharArray();
            int countA = 0;
            for(int i = 0;i < chars.length;i++){
                if(chars[i] == 'A'){
                    countA++;
                }
                if(i!=0&&i!=(chars.length-1)&&chars[i-1]=='L'&&chars[i]=='L'&&chars[i+1]=='L'){
                    return  false;
                }
            }
            if(countA > 1){
                return  false;
            }
            return true;
        }
    }
}
