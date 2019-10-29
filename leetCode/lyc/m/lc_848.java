class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        char[] res=S.toCharArray();
        if(shifts.length!=S.length()){
            return "";
        }
        for(int i=shifts.length-2;i>=0;i--){
            shifts[i]+=shifts[i+1]%26;
        }
        for(int i=0;i<S.length();i++){
            res[i]=(char)((res[i]-'a'+shifts[i])%26+'a');
        }
        return String.copyValueOf(res);
    }
   
}
/*超出时间限制*/
class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        char[] res=S.toCharArray();
        if(shifts.length!=S.length()){
            return "";
        }
        for(int i=shifts.length-2;i>=0;i--){
            shifts[i]+=shifts[i+1]%26;
        }
        for(int i=0;i<S.length();i++){
            res[i]=(char)((res[i]-'a'+shifts[i])%26+'a');
        }
        return String.copyValueOf(res);
    }
   
}