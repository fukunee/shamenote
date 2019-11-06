/*Valid Anagram*/
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] str = s.toCharArray();
        char[] ttr = t.toCharArray();
        
        Arrays.sort(str);
        Arrays.sort(ttr);
        int i = 0;
        int j = 0;
        while(i < str.length && j < ttr.length){
            if(str[i] != ttr[j]){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}