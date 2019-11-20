package easy;
/*lc_804*/
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations {
    public static void main(String[] args){
        Solution solution = new UniqueMorseRepresentations().new Solution();
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        System.out.print(solution.uniqueMorseRepresentations(words));
    }
    class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            if(words.length == 0){
                return 0;
            }

            String[] mos = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            Set<String> set = new HashSet<>();

            for(String str : words){
                StringBuilder sb = new StringBuilder();
                for(char c : str.toCharArray()){
                    sb.append(mos[c-'a']);
                }
                set.add(sb.toString());
            }
            int res = set.size();
            return  res;
        }
    }
}
