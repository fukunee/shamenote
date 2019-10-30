/*Intersection of Two Arrays II*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int c:nums1){
            list1.add(c);
        }
        for(int c:nums2){
            if(list1.contains(c)){
                list2.add(c);
                list1.remove(Integer.valueOf(c));
            }
        }
        int[] res=new int[list2.size()];
        int k=0;
        for(int c:list2){
            res[k++]=c;
        }
        return res;
    }
}