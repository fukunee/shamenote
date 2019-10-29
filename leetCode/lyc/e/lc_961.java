class Solution {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                return A[i];
            }else{
                map.put(A[i],1);
            }
        }
        return 0;
    }
}