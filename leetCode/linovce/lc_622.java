class MyCircularQueue {
    
    List <Integer> list;
    int max;
    int num;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        list = new ArrayList<>();
        max=k;
        num=-1;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(num+1<max){
            list.add(value);
            num++;
            return true;
        }
        else
            return false;
            
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(num>=0){
            list.remove(0);
            num--;
            return true;
        }else
            return false;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(num==-1)
            return -1;
        else
            return list.get(0);
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(num==-1)
            return -1;
        else
            return list.get(num);
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(num==-1)
            return true;
        else
            return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(num==max-1)
            return true;
        else
            return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */