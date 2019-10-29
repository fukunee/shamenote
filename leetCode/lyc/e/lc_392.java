class Solution {
    public boolean isSubsequence(String s, String t) {
        int len = 0;
        int i=0;
        int tag = 0;
        while(i < s.length()){
            if( t.indexOf(s.charAt(len),tag) >= tag){
                tag = t.indexOf(s.charAt(len),tag) + 1;
                len++;
            }
            i++;
            
        }
        
        
        return len == s.length();
    }
}