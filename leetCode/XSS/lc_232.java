import java.util.Stack;

public class lc_232 {
    public static void main(String[] args) {

    }
    static class MyQueue {
        Stack<Integer> stackB;
        Stack<Integer> stackA;
        int size;
        /** Initialize your data structure here. */
        public MyQueue() {
            stackA=new Stack<>();
            stackB=new Stack<>();
            size=0;
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            stackA.push(x);size++;
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(stackB.isEmpty())
            {
                while (!stackA.isEmpty())
                {
                    stackB.push(stackA.pop());

                }
            }
            if(size>0)size--;
            else return -1;
            return stackB.pop();
        }

        /** Get the front element. */
        public int peek() {
            if(stackB.isEmpty())
            {
                while (!stackA.isEmpty())
                {
                    stackB.push(stackA.pop());
                }
            }
            if(size>0)return stackB.peek();
            return -1;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            if(size<=0)return true;
            else return false;
        }
    }
}
