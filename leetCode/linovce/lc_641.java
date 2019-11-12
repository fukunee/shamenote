class MyCircularDeque {
    List<Integer> list;
    int max;
    int num;
    
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        list = new ArrayList<>();
        max = k;
        num=0;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(num==max)
            return false;
        list.add(0,value);
        num++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(num==max)
            return false;
        list.add(value);
        num++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(num==0)
            return false;
        list.remove(0);
        num--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(num==0)
            return false;
        list.remove(num-1);
        num--;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(num==0)
            return -1;
        return list.get(0);
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(num==0)
            return -1;
        return list.get(num-1);
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(num==0)
            return true;
        return false;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if(num==max)
            return true;
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */