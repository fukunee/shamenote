package leetcode;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author lwc
 * @date 2019/11/27 15:52
 */
public class lc_284 {
    class PeekingIterator implements Iterator<Integer> {

        Iterator<Integer> iterator;
        Integer cur;
        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.iterator = iterator;
            cur = null;
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            if(cur != null || iterator.hasNext()) {
                if (cur == null)
                    cur = iterator.next();
                return cur;
            }
            return null;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            if(cur != null || iterator.hasNext()) {
                Integer value = this.peek();
                cur = null;
                return value;
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            return cur != null || iterator.hasNext();
        }
    }
}
