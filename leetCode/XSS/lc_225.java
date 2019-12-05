import java.util.LinkedList;
import java.util.Queue;

public class lc_225 {
    public static void main(String[] args) {
        //用队列实现栈
        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        myStack.pop();
        System.out.println(myStack.top());
    }
    static class MyStack {

        Queue<Integer> stack;
        int size;
        /** Initialize your data structure here. */
        public MyStack() {
           stack=new LinkedList<>();
           size=0;
        }

        /** Push element x onto stack. */
        public void push(int x) {
            stack.offer(x);
            for(int i=0;i<size;i++)
            {
                stack.offer(stack.remove());
            }
            size++;

        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop()
        {
            return stack.remove();
        }

        /** Get the top element. */
        public int top() {
            return stack.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return stack.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
