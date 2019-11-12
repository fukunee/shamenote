package solution2;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author lwc
 * @date 2019/11/10 22:48
 */
public class MinStack {
    LinkedList<Integer> stack;
    int min;

    public MinStack() {
        stack = new LinkedList<>();
        min = 0;
    }

    public void push(int x) {
        if(stack.isEmpty() || x < min){
            min = x;
        }
        stack.push(min);
        stack.push(x);
    }

    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
            stack.pop();
        }
        if(!stack.isEmpty())
            min = stack.get(1);
    }

    public int top() {
        if(!stack.isEmpty())
            return stack.peek();
        return -1;
    }

    public int getMin() {
        return min;
    }
}
