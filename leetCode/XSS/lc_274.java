import java.util.Arrays;

public class lc_274 {
    public static void main(String[] args) {

    }
    class Solution
    {
        public int hIndex(int[] citations) {
            Arrays.sort(citations);
            int len=citations.length;
            if(len==0) return 0;
            int i=0;
            while(i<len&&citations[len-i-1]>=i+1)
            {i++;}
            return i;
        }
    }
}
