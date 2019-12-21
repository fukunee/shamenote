package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2019/12/16 11:13
 */
public class lc_380 {
    class RandomizedSet {
        HashMap<Integer,Integer> map;
        ArrayList<Integer> list;
        int size = -1;
        /** Initialize your data structure here. */
        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if(map.containsKey(val)) return false;
            list.add(val);
            map.put(val, ++size);
            return true;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if(!map.containsKey(val)) return false;
            int index = map.remove(val);
            if(index != size){
                list.set(index,list.get(size));
                map.put(list.get(size),index);
            }
            list.remove(size--);
            return true;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            Random random = new Random();
            int i = random.nextInt(size + 1);
            return list.get(i);
        }
    }
}
