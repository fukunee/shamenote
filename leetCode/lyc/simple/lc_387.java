
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] chs=s.toCharArray();
        for(char ch:chs){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<chs.length;i++){
            if(map.get(chs[i])==1){
                return i;
            }
        }
        return -1;
    }
}