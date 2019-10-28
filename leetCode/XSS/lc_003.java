import java.util.HashSet;
import java.util.Set;

public class lc_003 {
    public static void main(String[] args) {
//无重复字符的最长子串
    }
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int n=s.length();
            Set<Character> set=new HashSet<>();
            int ans=0,i=0,j=0;
            while ( i<n&&j<n)
            {
                if(!set.contains(s.charAt(j)))
                {
                    set.add(s.charAt(j++));
                    ans=Math.max(ans,j-i);
                }
                else
                {
                    set.remove(s.charAt(i++));
                }
            }
            return ans;

        }
    }
}
