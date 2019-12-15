package leetcode;

import java.util.Collections;
import java.util.HashSet;

/**
 * @author lwc
 * @date 2019/12/9 17:25
 */
public class lc_345 {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');set.add('o');set.add('i');set.add('u');set.add('e');
        set.add('A');set.add('O');set.add('I');set.add('U');set.add('E');
        char[] ch = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while(left < right){
            while(left < right && !set.contains(ch[left])) left++;
            while(left < right && !set.contains(ch[right])) right--;
            char c = ch[left];
            ch[left++] = ch[right];
            ch[right--] = c;
        }
        return new String(ch);
    }

}
