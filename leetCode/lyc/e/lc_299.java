/*Bulls and Cows*/
class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> map= new HashMap<>();
        List<Character> list=new ArrayList<>();
        int tagA=0;
        int tagB=0;
        for(int i=0;i<secret.length();i++){
            char st=secret.charAt(i);
            if(st==guess.charAt(i)){
                tagA+=1;
            }else{
                list.add(guess.charAt(i));
                if(map.containsKey(st)){
                    map.put(st,map.get(st)+1);
                }else{
                    map.put(st,1);
                }
            }
        }
        for(Character c : list){
            if(map.containsKey(c)){
                tagB+=1;
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
            }
        }
        return tagA+"A"+tagB+"B";
    }    
}