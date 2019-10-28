public class lc_012 {
    public static void main(String[] args) {

    }
    static class Solution {
        public String intToRoman(int num) {
            String Q[] = {"", "M", "MM", "MMM"};
            String B[]= {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String  S[]= {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String G[]= {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            return Q[num/1000] + B[(num%1000)/100] + S[(num%100)/10] + G[num%10];
        }
    }
}
