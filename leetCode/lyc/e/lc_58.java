/*Length of Last Word*/
class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null){
            return 0;
        }
        String[] str = s.split(" ");
        if(str.length != 0){
            return str[str.length-1].length();
        }
        return 0;
    }
}