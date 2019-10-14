class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(""))
            return true;
        s = s.toLowerCase();
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            while(!(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9')&&i<j){
                i++;
            }
            while(!(s.charAt(j)>='a'&&s.charAt(j)<='z'||s.charAt(j)>='0'&&s.charAt(j)<='9')&&i<j){
                j--;
            }
            if(i<j){
                if(!(s.charAt(i)==s.charAt(j)))
                    return false;
            }
            
        }
        
        return true;
    }
}