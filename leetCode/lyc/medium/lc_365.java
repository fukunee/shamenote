class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x+y<z){
            return false;
        }
        if(x==z||y==z||(x+y)==z){
            return true;
        }
        while(y!=0){
            int r=x%y;
            x=y;
            y=r;
        }
        return z%x==0;
    }
}