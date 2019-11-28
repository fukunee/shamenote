package solution2;

public class U5 {

    public static int curLeft = 0,curRight = 0;

    public String longestPalindrome(String s) {
        if(s.isEmpty()) return s;
        for(int i=1;i<s.length();i++) {
            int len1 = longest(s,i,i);
            int len2 = longest(s,i-1,i);
            int len = Math.max(len1,len2);
            if(len>curRight+1-curLeft){
                curLeft = i-len/2;
                curRight = i+(len-1)/2;
            }
        }
        return s.substring(curLeft,curRight+1);
    }

    public int longest(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
