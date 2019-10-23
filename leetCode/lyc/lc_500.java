class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character,Integer>map=new HashMap<>();
        Character[] str1=new Character[]{'Q','W','E','R','T','Y','U','I','O','P','q','w','e','r','t','y','u','i','o','p'};
        Character[] str2=new Character[]{'A','S','D','F','G','H','J','K','L','a','s','d','f','g','h','j','k','l'};
        Character[] str3=new Character[]{'Z','X','C','V','B','N','M','z','x','c','v','b','n','m'};
        
        for(int i=0;i<str1.length;i++){
            map.put(str1[i],1);
        }
        for(int i=0;i<str2.length;i++){
            map.put(str2[i],2);
        }
        for(int i=0;i<str3.length;i++){
            map.put(str3[i],3);
        }
        List<String> res = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(issame(words[i],map)){
                res.add(words[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
    public boolean issame(String str,HashMap<Character,Integer> map){
         
        int tag=map.get(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(map.get(str.charAt(i))!=tag){
                return false;
            }
        }
        return true;
    }
    
}