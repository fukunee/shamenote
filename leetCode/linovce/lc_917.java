class Solution {
    public String reverseOnlyLetters(String S) {
        char[] s = S.toCharArray();
        
        for(int i=0,j=s.length-1;i<j;){
            if(s[i]<'a'&&s[i]>'Z'||s[i]>='!'&&s[i]<'A'){
                i++;
            }
            else if(s[j]<'a'&&s[j]>'Z'||s[j]>='!'&&s[j]<'A'){
                j--;
            }
            else{
                char t = s[i];
                s[i]=s[j];
                s[j]=t;
                i++;
                j--;
            }
        }
        
        return String.valueOf(s);
    }
}