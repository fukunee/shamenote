package leetcode;

import java.util.LinkedList;

/**
 * @author lwc
 * @date 2019/11/22 16:04
 */
public class lc_225 {
    class MyStack {

        LinkedList<Integer> stack;
        /** Initialize your data structure here. */

        public MyStack() {
            stack = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            stack.offer(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            LinkedList<Integer> queue = new LinkedList<>();
            int value = stack.poll();
            while(!stack.isEmpty()){
                queue.offer(value);
                value = stack.poll();
            }
            stack = queue;
            return value;
        }

        /** Get the top element. */
        public int top() {
            int value = this.pop();
            this.stack.offer(value);
            return value;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return stack.isEmpty();
        }
    }
}
