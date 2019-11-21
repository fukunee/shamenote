package easy;
/*lc_709*/
public class ToLowerCase {
    public static void main(String[] args){
        Solution solution = new ToLowerCase().new Solution();
        String str = "LOVELY";
        System.out.print(solution.toLowerCase(str));
    }
    class Solution {
        public String toLowerCase(String str) {
            if(str.length() == 0){
                return str;
            }
            StringBuilder sb = new StringBuilder();
            for(char c : str.toCharArray()){
                if(c >= 'A' && c <= 'Z'){
                    c += 32;
                }
                sb.append(c);
            }
            return sb.toString();
        }
    }
}
