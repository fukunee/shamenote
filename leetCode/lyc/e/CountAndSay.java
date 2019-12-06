package easy;
/*lc_38*/
public class CountAndSay {
    public static void main(String[] args){
        Solution solution = new CountAndSay().new Solution();
        int n = 9;
        System.out.print(solution.countAndSay(n));
    }
    class Solution {
        public String countAndSay(int n) {
            String fir = "1";
            for(int i = 1;i < n ;i++){
                StringBuilder sb = new StringBuilder();
                char c = fir.charAt(0);
                int count = 1;
                for(int j = 1; j < fir.length();j++){
                    char sc = fir.charAt(j);
                    if(sc == c){
                        count++;
                    }else{
                        sb.append(count).append(c);
                        count = 1;
                        c = sc;
                    }
                }
                sb.append(count).append(c);
                fir = sb.toString();
            }
            return fir;
        }
    }
}
