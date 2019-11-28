/*Group Anagrams*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        if(strs.length == 0){
            return null;
        }
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sch = String.valueOf(ch); 
            if(!map.containsKey(sch)){
                map.put(sch, new ArrayList<>());
                map.get(sch).add(str);
            }else{
                map.get(sch).add(str);
            }
        }
        return new ArrayList(map.values());
    }
}