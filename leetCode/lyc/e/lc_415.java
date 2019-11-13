/*Add Strings*/
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int len1 = num1.length();
        int len2 = num2.length();
        int temp = 0;
        int i = len1 - 1;
        int j = len2 - 1;
        while(i >= 0 || j>= 0){
            int n1 = i >= 0 ? (num1.charAt(i) - '0') : 0;
            int n2 = j >= 0 ? (num2.charAt(j) - '0') : 0;
            
            temp += (n1 + n2);
            res.append(temp % 10);
            temp /= 10; 
            i--;
            j--;
        }
        if(temp != 0){
            res.append(temp);
        }
        return res.reverse().toString();
    }
}