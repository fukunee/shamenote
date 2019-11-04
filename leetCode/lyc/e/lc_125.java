/*Valid Palindrome*/
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
        s=s.toLowerCase();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            while(l<r&&isnotcn(s.charAt(l))){
                l++;
            }
            while(l<r&&isnotcn(s.charAt(r))){
                r--;
            }
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isnotcn(char c){
         if((c>='0'&&c<='9')||(c>='a'&&c<='z')){
             return false;
         }
        return true;
    }
}