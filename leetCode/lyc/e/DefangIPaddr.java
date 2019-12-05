package easy;
/*lc_1108*/
public class DefangIPaddr {
    public static void main(String[] args){
        Solution solution = new DefangIPaddr().new Solution();
        String address = "255.100.50.0";
        System.out.print(solution.defangIPaddr(address));
    }
    class Solution {
        public String defangIPaddr(String address) {
            StringBuilder sb = new StringBuilder();
            for(char c : address.toCharArray()){
                if(c == '.'){
                    sb.append("[.]");
                    continue;
                }
                sb.append(c);
            }
            return sb.toString();
        }
    }
}
