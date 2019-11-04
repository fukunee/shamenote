package solution2;

/**
 * @author lwc
 * @date 2019/10/30 20:14
 */
public class U125 {
    public boolean isPalindrome(String s) {
        int i = 0; int j = s.length()-1;
        char[] v = s.toCharArray();
        while(i < j){
            while(i < v.length && !Character.isLetterOrDigit(v[i]))
                i++;
            while(j >=0 && !Character.isLetterOrDigit(v[j]))
                j--;
            if(i < j && Character.toLowerCase(v[i]) != Character.toLowerCase(v[j]))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
