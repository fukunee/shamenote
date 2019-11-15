class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<cpdomains.length;i++){
            String[] str = cpdomains[i].split(" ");
            int n = Integer.parseInt(str[0]);
            
            String[] t = str[1].split("\\.");
            
            for(int j=0;j<t.length;j++){
                String s = "";
                
                for(int k=j;k<t.length-1;k++){
                    s=s+t[k]+".";
                }
                s=s+t[t.length-1];
                if(map.containsKey(s)){
                    int temp = map.get(s)+n;
                    map.put(s,temp);
                }else
                    map.put(s,n);
            }
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String s = entry.getValue()+" "+entry.getKey();
            list.add(s);
        }
        
        return list;
    }
}