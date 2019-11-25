package solution2;

import java.util.LinkedList;

/**
 * @author lwc
 * @date 2019/11/12 9:20
 */
public class U150 {
    public int evalRPN(String[] tokens) {
        LinkedList<Integer> stack = new LinkedList<>();
        for(int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            if(token.equals("+"))
                stack.push(stack.pop() + stack.pop());
            else if(token.equals("-")){
                int num1 = stack.pop();
                stack.push(stack.pop() - num1);
            }
            else if(token.equals("*"))
                stack.push(stack.pop() * stack.pop());
            else if(token.equals("/")) {
                int num1 = stack.pop();
                stack.push(stack.pop() / num1);
            }
            else
                stack.push(Integer.valueOf(token));
        }
        return stack.pop();
    }
}
