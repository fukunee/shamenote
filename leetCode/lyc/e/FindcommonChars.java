package easy;
/*lc_1002*/
import java.util.ArrayList;
import java.util.List;

public class FindcommonChars {
    public static void main(String[] args){
        Solution solution = new FindcommonChars().new Solution();
        String[] A = new String[]{"bella","label","roller"};
        System.out.print(solution.commonChars(A));
    }
    class Solution {
        public List<String> commonChars(String[] A) {
            List<String> list = new ArrayList<>();
            int[] words = new int[26];

            for(char c : A[0].toCharArray()){
                words[c - 'a']++;
            }
            for(int i = 1;i < A.length;i++){
                int[] temp = new int[26];
                for(char c :A[i].toCharArray()){
                    temp[c - 'a']++;
                }
                for(int j = 0; j < 26;j++){
                    words[j] = Math.min(words[j],temp[j]);
                }
            }
            for(int i = 0;i < 26;i++){
                if(words[i] > 0){
                    for(int k = 0;k < words[i];k++){
                        list.add((char)('a' + i) + " ");
                    }

                }
            }
            return list;
        }
    }
}
