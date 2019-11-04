
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i=1;i<=s.length();i++){
            for(char ch:map.keySet()){
                if(map.get(ch)==i){
                   for(int j=0;j<i;j++){
                        res.append(ch);
                    }
                }
            }
        }
        return res.reverse().toString();
    }
}