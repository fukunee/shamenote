class Solution {
    public int balancedStringSplit(String s) {
        int n=0;
        int t=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')
                t--;
            else if(s.charAt(i)=='R')
                t++;
            
            if(t==0){
                n++;
            }
        }
        return n;
    }
}