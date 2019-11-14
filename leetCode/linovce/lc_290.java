class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        
        String[] s = str.split(" ");
        if(s.length!=pattern.length())
            return false;
        
        for(int i=0;i<s.length;i++){
            if(!map1.containsKey(pattern.charAt(i))&&!map2.containsKey(s[i])){
                map1.put(pattern.charAt(i),s[i]);
                map2.put(s[i],pattern.charAt(i));
            }
            
            else if(map1.containsKey(pattern.charAt(i))&&map2.containsKey(s[i])){
                    if(map1.get(pattern.charAt(i)).equals(s[i])&&map2.get(s[i])==pattern.charAt(i))
                        continue;
                    else
                        return false;
            }
            else
                return false;
        }
        
        return true;
    }
}