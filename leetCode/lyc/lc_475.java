class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int res=0;
        for(int i=0;i<houses.length;i++){
            int tag=findbest(houses[i],heaters);
            if(tag>res){
                res=tag;
            }
        }
        return res;
    }
    public int findbest(int num, int[] heaters){
        int index=Integer.MAX_VALUE;
        for(int i=0;i<heaters.length;i++){
            if(Math.abs(heaters[i]-num)<index){
                index=Math.abs(heaters[i]-num);
            }
        }
        return index;
    }
}