package solution2;

/**
 * @author lwc
 * @date 2019/10/26 13:33
 */
public class U97 {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int[][] v = new int[len1+1][len2+1];
        if(len1 + len2 != s3.length()) return false;
        return recursive(s1,s2,s3,0,0,v);
    }

    public boolean recursive(String s1, String s2, String s3,int i, int j, int[][] v){
        while(i < s1.length() || j < s2.length()){
            if(v[i][j] == 1) return false;

            char ch3 = s3.charAt(i+j),ch1 = '\0',ch2 = '\0';
            if(i < s1.length()) ch1 = s1.charAt(i);
            if(j < s2.length()) ch2 = s2.charAt(j);
            v[i][j] = 1;

            if(i < s1.length() && j >= s2.length()) {
                if (ch1 == ch3) i++;
                else return false;
            }
            else if(i >= s1.length() && j < s2.length()){
                if(ch2 == ch3) j++;
                else return false;
            }
            else{
                if(ch1 == ch3 && ch2 == ch3)
                    return recursive(s1,s2,s3,i+1,j,v) || recursive(s1,s2,s3,i,j+1,v);
                else if(ch1 == ch3 && ch2 != ch3)
                    i++;
                else if(ch1 != ch3 && ch2 == ch3)
                    j++;
                else
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new U97().isInterleave("aabcc","dbbca","aadbbcbcac"));
    }
}
