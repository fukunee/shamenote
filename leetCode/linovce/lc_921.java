class Solution {
    public int minAddToMakeValid(String S) {
        int i=0,j=0;
        int n=0;
        for(int k=0;k<S.length();k++){
            if(S.charAt(k)==')')
                j++;
            else if(S.charAt(k)=='(')
                i++;
            if(j>i){
                i++;
                n++;
            }                
        }
        
        return n+i-j;
    }
}