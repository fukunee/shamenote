package solution2;

import java.util.HashMap;

public class U3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLength = 0;
        int flag = 0,head = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)) flag++;
            else{
                maxLength = Math.max(flag,maxLength);
                head = map.get(c)>head?map.get(c):head;
                flag = i-head;
            }
            map.put(c,i);
        }
        return Math.max(flag,maxLength);
    }
}
