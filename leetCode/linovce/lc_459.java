class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str = "";

        for(int i=0;i<s.length()/2;i++){
            
            str=str+s.charAt(i);
            if(s.length()%str.length()!=0)
                continue;
            String t = s.replace(str,"");
            if(t.equals(""))
                return true;
        }

        return false;
    }
}