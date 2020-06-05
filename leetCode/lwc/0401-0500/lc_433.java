package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2020/1/2 16:00
 */
public class lc_433 {
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String> set = new HashSet<>();
        for(String str : bank) set.add(str);
        LinkedList<String> list = new LinkedList<>(set);
        if(!set.contains(end)) return -1;

        return help(Arrays.asList(start), list, 1, end);
    }

    public int help(List<String> temp, LinkedList<String> list, int level, String end){
        List<String> nextList = new ArrayList<>();
        for(String s1 : temp){
            for(int i = 0; i < list.size(); i++){
                String s2 = list.get(i);
                if(change(s1, s2)){
                    if(s2.equals(end)) return level;
                    nextList.add(s2);
                    list.remove(i--);
                }
            }
        }
        if(nextList.isEmpty()) return -1;
        return help(nextList, list, level + 1, end);
    }

    public boolean change(String s1, String s2){
        int mark = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(mark == 0) mark = 1;
                else return false;
            }
        }
        return mark == 1;
    }


}
