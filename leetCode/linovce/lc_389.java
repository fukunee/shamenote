class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int q = map.get(s.charAt(i))+1;
                map.put(s.charAt(i),q);
            }else
                map.put(s.charAt(i),1);
        }
        
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                int q = map.get(t.charAt(i))-1;
                map.put(t.charAt(i),q);
            }else
                return t.charAt(i);
        }
        
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=0)
                return entry.getKey();
        }
        return 'a';
    }
}