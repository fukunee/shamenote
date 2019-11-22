class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            Map<Character,Character> map = new HashMap<>();
            int f=1;
            for(int j=0;j<pattern.length();j++){
                if(!map.containsKey(pattern.charAt(j))){
                    if(map.containsValue(words[i].charAt(j))){
                        f=0;
                        break;
                    }
                    map.put(pattern.charAt(j),words[i].charAt(j));
                }else if(map.get(pattern.charAt(j))!=words[i].charAt(j)){
                    f=0;
                    break;
                }
                    
            }

            if(f==1)
                list.add(words[i]);
        }

        return list;
    }
}
