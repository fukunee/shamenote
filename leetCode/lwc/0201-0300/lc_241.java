package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2019/11/26 15:00
 */
public class lc_241 {
    public List<Integer> diffWaysToCompute(String input) {
        // 2*3-4*5
        Map<String, List<Integer>> map = new HashMap<>();
        List<String> exps = new ArrayList<>();
        char[] chars = input.toCharArray();
        int tempV = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (Character.isDigit(ch))
                tempV = 10 * tempV + (ch - '0');
            else {
                map.put(String.valueOf(tempV), Arrays.asList(tempV));
                tempV = 0;
            }
        }
        map.put(String.valueOf(tempV), Arrays.asList(tempV));
        return calculate(input, map);
    }

    public List<Integer> calculate(String input, Map<String,List<Integer>> map){
        if(map.containsKey(input))
            return map.get(input);
        List<Integer> rs = new ArrayList<>();
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                String exp1 = input.substring(0, i);
                String exp2 = input.substring(i+1);
                List<Integer> left, right;
                if(!map.containsKey(exp1))
                    map.put(exp1, calculate(exp1, map));
                if(!map.containsKey(exp2))
                    map.put(exp2, calculate(exp2, map));
                left = map.get(exp1);
                right = map.get(exp2);
                for(int l : left){
                    for(int r : right){
                        if(ch == '*')
                            rs.add(l * r);
                        else if(ch == '+')
                            rs.add(l + r);
                        else
                            rs.add(l - r);
                    }
                }
            }
        }
        return rs;
    }

}
