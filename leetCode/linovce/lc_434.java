class Solution {
    public int countSegments(String s) {
        int n=0;
        int f=0;
        for(int i=0;i<s.length();i++){
            if(f==0){
                if(s.charAt(i)!=' '){
                    f=1;
                    n++;
                }
                else{
                    f=0;
                    continue;
                }                    
            }
            else{
                if(s.charAt(i)!=' ')
                    continue;
                else{
                    f=0;
                    continue;
                }
            }
        }
        return n;
    }
}