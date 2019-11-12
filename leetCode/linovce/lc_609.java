class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,Integer> map = new HashMap<>();
        List<List<String>> list = new ArrayList<List<String>>();
        
        for(int i=0;i<paths.length;i++){
            String[] t = paths[i].split(" ");
            
            for(int j=1;j<t.length;j++){
                String s = t[j].substring(t[j].indexOf("(")+1,t[j].indexOf(")"));
                if(map.containsKey(s)){
                    List<String>  l = list.get(map.get(s));
                    l.add(t[0]+"/"+t[j].substring(0,t[j].indexOf("(")));
                    list.set(map.get(s),l);
                }else{
                    List<String>  l = new ArrayList<>();
                    l.add(t[0]+"/"+t[j].substring(0,t[j].indexOf("(")));
                    list.add(l);
                    map.put(s,list.size()-1);
                }
            }
            
        }
        
        for(int i=0;i<list.size();){
            if(list.get(i).size()==1)
                list.remove(i);
            else
                i++;
        }
        
        return list;
    }
}