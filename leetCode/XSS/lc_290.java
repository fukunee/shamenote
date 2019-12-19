import com.sun.xml.internal.ws.wsdl.parser.MemberSubmissionAddressingWSDLParserExtension;

import java.util.*;
import java.util.stream.StreamSupport;

public class lc_290 {
    public static void main(String[] args) {
        System.out.println(new Solution().wordPattern("abba",
                "dog cat cat dog"));
    }

    static class Solution {
        public boolean wordPattern(String pattern, String str) {
            String[] s = str.split(" ");
            if(s.length != pattern.length()) return false;
            Map<Character, String> map = new HashMap<>();
            for(int i = 0; i < pattern.length(); i++){
                if(!map.containsKey(pattern.charAt(i))){
                    if(map.containsValue(s[i])) return false;
                    map.put(pattern.charAt(i), s[i]);
                }else{
                    if(!map.get(pattern.charAt(i)).equals(s[i])) return false;
                }
            }
            return true;
        }
    }
}