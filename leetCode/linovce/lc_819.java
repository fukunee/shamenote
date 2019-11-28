class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<banned.length;i++)
            set.add(banned[i]);
        
        String[] str = paragraph.toLowerCase().split(" |!|\\?|'|,|;|\\.");
        
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<str.length;i++){
            str[i].replaceAll(" ","");
            
            if(set.contains(str[i])||str[i].length()==0)
                continue;
            
            if(map.containsKey(str[i]))
            {
                int t = map.get(str[i])+1;
                map.put(str[i],t);
            }else
                map.put(str[i],1);
        }
        
        int max=0;
        String r = "";
        System.out.println(map);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(!entry.getKey().equals("?") && !entry.getKey().equals("!") && !entry.getKey().equals(" ") && entry.getValue()>max && !entry.getKey().equals(",") && !entry.getKey().equals(",") && !entry.getKey().equals(";") && !entry.getKey().equals("."))
            {
                max=entry.getValue();
                r=entry.getKey();
            }
        }
        
        return r;
    }
}