package leetcode;

/**
 * @author lwc
 * @date 2020/1/2 16:32
 */
public class lc_434 {
    public int countSegments(String s) {
        if(s.isEmpty()) return 0;
        s += " ";
        int count = 0; char pre = ' ';
        for(char ch : s.toCharArray()){
            if(ch == ' ' && pre != ' '){
                count++;
            }
            pre = ch;
        }
        return count;
    }
}
