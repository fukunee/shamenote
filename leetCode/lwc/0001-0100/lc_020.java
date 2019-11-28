package solution2;

import javafx.scene.chart.StackedAreaChart;
import ucollection.umap.UMap;

import java.util.HashMap;
import java.util.Stack;

public class U20 {
    public boolean isValid(String s) {
        if(s.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(int i = 0; i < s.length(); i++){
            if(map.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty() || stack.pop()!=map.get(s.charAt(i)))
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
