/*Ransom Note*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine == null){
            return false;
        }
        StringBuilder str = new StringBuilder(magazine);
        
        for(char c : ransomNote.toCharArray()){
            int index = str.indexOf(String.valueOf(c));
            if(index >= 0){
                str.deleteCharAt(index);
            }else{
                return false;
            }
        }
        return true;
    }
}