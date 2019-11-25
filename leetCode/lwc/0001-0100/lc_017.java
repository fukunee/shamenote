package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class U17 {

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        String[] strings = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> rs = Arrays.asList("");
        for (int i = 0; i < digits.length(); i++) {
            char[] chars = strings[digits.charAt(i)-'0'].toCharArray();
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < rs.size(); k++) {
                    temp.add(rs.get(k)+chars[j]);
                }
            }
            rs = temp;
        }
        return rs;
    }
}
