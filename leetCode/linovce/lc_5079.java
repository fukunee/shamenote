class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i]))
                map.put(arr1[i],1);
            else{
                int t = map.get(arr1[i])+1;
                map.put(arr1[i],t);
            }
        }
        
        for(int i=0;i<arr2.length;i++){
            if(!map.containsKey(arr2[i]))
                map.put(arr2[i],1);
            else{
                int t = map.get(arr2[i])+1;
                map.put(arr2[i],t);
            }
        }
        
        for(int i=0;i<arr3.length;i++){
            if(!map.containsKey(arr3[i]))
                map.put(arr3[i],1);
            else{
                int t = map.get(arr3[i])+1;
                map.put(arr3[i],t);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==3)
                list.add(entry.getKey());
        }
        
        return list;
    }
}