package easy;
/*lc_929*/
import java.util.HashSet;
import java.util.Set;

public class UniqueEmailsAddress {
    public static void main (String[] args){
        Solution solution = new UniqueEmailsAddress().new Solution();
        String[] emails = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.print(solution.numUniqueEmails(emails));
    }
    class Solution {
        public int numUniqueEmails(String[] emails) {
            Set<String> set = new HashSet<>();
            for(String str : emails ){
                StringBuilder sb = new StringBuilder();
                String[] strs = str.split("@");
                for(char c : strs[0].toCharArray()){
                    if(c == '.'){
                        continue;
                    }else if(c == '+'){
                        break;
                    }
                    sb.append(c);
                }
                sb.append('@').append(strs[1]);
                set.add(sb.toString());
            }
            return set.size();
        }
    }
}
