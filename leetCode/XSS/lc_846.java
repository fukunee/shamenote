import java.util.Map;
import java.util.TreeMap;

public class lc_846 {
    public static void main(String[] args) {

    }
    class Solution
    {
        public boolean isNStraightHand(int[] hand, int W) {
            int len=hand.length;
            if(hand==null||W<=0||W>hand.length)return false;
            if(len%W!=0)return false;
            Map<Integer,Integer> map=new TreeMap<>();
            for(int i=0;i<hand.length;i++)
            {
                map.put(hand[i],map.getOrDefault(hand[i],0)+1);
            }
            Integer []keysets=new Integer[map.keySet().size()];
            map.keySet().toArray(keysets);
            for(int i:keysets)
            {
                int k1=map.get(i);
                if(k1<=0)continue;
                for(int j=0;j<W;j++)
                {
                    int k2=map.getOrDefault(i+j,0);
                    if(k2<k1)return false;
                    map.put(i+j,k2-k1);
                }
            }
            return true;
        }
    }
}
