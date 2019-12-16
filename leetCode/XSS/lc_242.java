import java.util.HashMap;

public class lc_242 {
    public static void main(String[] args) {

    }
    static class Solution {
        public boolean isAnagram(String s, String t) {
            HashMap<Character,Integer> map=new HashMap();
            char cs[]=s.toCharArray();
            char ts[]=t.toCharArray();
            for(char c:cs)
            {
                if(map.containsKey(c))
                {
                    map.put(c,map.get(c)+1);
                }
                else {
                    map.put(c,1);
                }
            }
            for(char c:ts)
            {
                if(map.containsKey(c))
                {
                    if(map.get(c)==1)
                    {
                        map.remove(c);
                    }
                    else
                    {
                        map.put(c,map.get(c)-1);
                    }
                }
                else
                {
                    return false;
                }
            }

            return map.isEmpty();
        }
    }
}
