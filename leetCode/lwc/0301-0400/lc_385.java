package leetcode;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/12/18 10:53
 */
public class lc_385 {
    public class NestedInteger {
        // Constructor initializes an empty nested list.
        public NestedInteger(){}

        //Constructor initializes a single integer.
        public NestedInteger(int value){}

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger(){return true;}

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger(){return 0;}

        // Set this NestedInteger to hold a single integer.
        public void setInteger(int value){}

        // Set this NestedInteger to hold a nested list and adds a nested integer to it.
        public void add(NestedInteger ni){}

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList(){return new ArrayList<>();}
    }

    public NestedInteger deserialize(String s) {
        if(s.charAt(0) != '[')
            return new NestedInteger(Integer.valueOf(s));
        return help(s.toCharArray(), 0).getValue();
    }

    public Pair<Integer,NestedInteger> help(char[] c, int i){
        int res = 0;
        int prefix = 1;
        int appear = 0;
        NestedInteger ni = new NestedInteger();
        while(i < c.length){
            if(c[i] == '['){
                if(appear == 1) {
                    Pair<Integer, NestedInteger> pair = help(c, i);
                    ni.add(pair.getValue());
                    i = pair.getKey();
                }
                else appear = 1;
            }
            else if(c[i] == '-'){
                prefix = -1;
            }
            else if(Character.isDigit(c[i])){
                res = res * 10 + (c[i] - '0');
            }
            else if(c[i] == ','){
                if(c[i-1] != ']') {
                    ni.add(new NestedInteger(res * prefix));
                    res = 0;
                    prefix = 1;
                }
            }
            else if(c[i] == ']'){
                if(Character.isDigit(c[i-1]))
                    ni.add(new NestedInteger(res * prefix));
                break;
            }
            i++;
        }
        return new Pair<>(i, ni);
    }

}
