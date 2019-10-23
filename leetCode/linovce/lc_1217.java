class Solution {
    public int minCostToMoveChips(int[] chips) {
        int n=0;
        for(int i=0;i<chips.length;i++){
            if(chips[i]%2==0)
                n++;
        }
        
        if(n>=chips.length-n){
            return chips.length-n;
        }
        else
            return n;
    }
}