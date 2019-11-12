/*Uncommon Words from Two Sectences*/
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] strA = A.split(" ");
        String[] strB = B.split(" ");
        List<String> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(String str : strA){
            if(map.containsKey(str)){
                map.put(str,map.get(str) + 1);
            }else{
                map.put(str,1);
            }
        }
        for(String str : strB){
            if(map.containsKey(str)){
                map.put(str,map.get(str) + 1);
            }else{
                map.put(str,1);
            }
        }
        
        for(String s : map.keySet()){
            if(map.get(s) == 1){
                list.add(s);
            }
        }
        String[] res = new String[list.size()];
        return list.toArray(res);
    }
}