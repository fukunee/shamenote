package leetcode;

import java.util.LinkedList;

/**
 * @author lwc
 * @date 2019/11/25 10:41
 */
public class lc_232 {
    class MyQueue {

        LinkedList<Integer> stack;
        boolean mark;
        /** Initialize your data structure here. */
        public MyQueue() {
            stack = new LinkedList<>();
            mark = false;
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            if(mark){
                stack = reserve(stack);
                mark = false;
            }
            stack.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            peek();
            return stack.pop();
        }

        /** Get the front element. */
        public int peek() {
            if(!mark) {
                stack = this.reserve(stack);
                mark = true;
            }
            return stack.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stack.isEmpty();
        }

        public LinkedList reserve(LinkedList stack){
            LinkedList temp = new LinkedList();
            while(!stack.isEmpty()){
                temp.push(stack.pop());
            }
            return temp;
        }
    }
}
