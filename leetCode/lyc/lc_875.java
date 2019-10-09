class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int min=1;
        int max=piles[0];
        for(int i=1;i<piles.length-1;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        while(min<max){
            int mid=(min+max)>>>1;
            if(eatall(piles,H,mid)){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return max;
    }
    public boolean eatall(int[] piles,int h,int mid){
        int time=0;
        for(int i=0;i<piles.length;i++){
            time+=piles[i]/mid;
            if(piles[i]%mid!=0){
                time+=1;
            }
        }
        return time<=h;
    }
} 