class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list=new ArrayList<Boolean>();
        int tag=0;
        for(int i=0;i<A.length;i++){
            tag=tag<<1;
            tag+=A[i];
            list.add(tag%5==0);
            tag%=5;
        
        }
        return list;
    }
    
}