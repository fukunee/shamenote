import java.util.Stack;

public class lc_155 {
    public static void main(String[] args) {
        //最小栈
    }
    static class MinStack {

        /** initialize your data structure here. */
        Stack<Integer> minStack;
        Stack<Integer> stack;
        public MinStack() {
            minStack=new Stack<>();
            stack=new Stack<>();
        }

        public void push(int x) {
            if(stack.isEmpty()||minStack.peek()>x)minStack.push(x);
            else
            {
                minStack.push(minStack.peek());
            }
            stack.push(x);
        }

        public void pop() {
            minStack.pop();
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

}
