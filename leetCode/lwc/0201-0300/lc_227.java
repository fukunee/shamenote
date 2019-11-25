package leetcode;

import java.util.LinkedList;

/**
 * @author lwc
 * @date 2019/11/22 16:33
 */
public class lc_227 {
    public int calculate(String s) {
        LinkedList<Integer> intQueue = new LinkedList<>();
        LinkedList<Character> charQueue = new LinkedList<>();
        s += "+";
        int v = 0;
        boolean cFlag = false,vFlag = false;
        for(char ch : s.toCharArray()){
            if(ch == ' ' || ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                if(vFlag) {
                    if (cFlag) {
                        if (charQueue.pollLast() == '*')
                            intQueue.offer(intQueue.pollLast() * v);
                        else
                            intQueue.offer(intQueue.pollLast() / v);
                        cFlag = false;
                    } else intQueue.offer(v);
                    v = 0;
                    vFlag = false;
                }
                if(ch != ' '){
                    if(ch == '*' || ch == '/') cFlag = true;
                    charQueue.offer(ch);
                }
            }else{
                v = v * 10 + Character.getNumericValue(ch);
                vFlag = true;
            }
        }

        charQueue.pollLast();
        int value = intQueue.poll();
        while (!charQueue.isEmpty()) {
            char ch = charQueue.poll();
            if (ch == '+') value += intQueue.poll();
            else value -= intQueue.poll();
        }
        return value;
    }
}
