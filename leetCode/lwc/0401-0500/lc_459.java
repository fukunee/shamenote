package leetcode;

/**
 * @author lwc
 * @date 2020/2/7 20:27
 */
public class lc_459 {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        if(len < 2) return false;
        for(int i = len / 2; i > 0; i--){
            if(len % i == 0){
                int j = i;
                String origin = s.substring(0, i);
                for(; j < len; j += i){
                    if(!s.substring(j, j + i).equals(origin))
                        break;
                }
                if(j == len) return true;
            }
        }
        return false;
    }
}
