
public class lc_299 {
    static class Solution {
        public String getHint(String secret, String guess) {
            int bull = 0, cow = 0;int d=0;
            StringBuilder guess1 = new StringBuilder(guess);
            StringBuilder secret1=new StringBuilder(secret);
            for (int i = 0; i < secret.length(); i++) {
                if (secret.charAt(i) == guess.charAt(i)) {
                    guess1.deleteCharAt(i-d);
                    secret1.deleteCharAt(i-d);
                    d++;
                    bull++;
                }
            }
            for (int i = 0; i < secret1.length(); i++) {
                int index = guess1.indexOf(String.valueOf(secret1.charAt(i)));
                if (index != -1) {
                    cow++;
                    guess1.setCharAt(index, 'x');
                }
            }
            StringBuilder resb=new StringBuilder();
            return resb.append(bull).append('A').append(cow).append('B').toString();

        }
    }
}
