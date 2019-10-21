class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int l=0;
        for(int i=0;i<chars.length();i++){
            if(map.containsKey(chars.charAt(i))){
                int t = map.get(chars.charAt(i))+1;
                map.put(chars.charAt(i),t);
            }
            else
                map.put(chars.charAt(i),1);
        }
        
        for(int i=0;i<words.length;i++){
            Map<Character,Integer> m = new HashMap<Character,Integer>();
            m.putAll(map);
            int f=0;
            for(int j=0;j<words[i].length();j++){
                if(m.containsKey(words[i].charAt(j))&&m.get(words[i].charAt(j))!=0)
                {
                    int t = m.get(words[i].charAt(j))-1;
                    m.put(words[i].charAt(j),t);
                }else{
                    f=1;
                    break;
                }                   
            }
            if(f==0){
                l+=words[i].length();
            } 
        }
        
        return l;
    }
}