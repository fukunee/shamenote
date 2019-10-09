class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] r = new int[num_people];
        int n=1;
        while(candies!=0){
            for(int i=0;i<num_people;i++){
                if(candies>=n){
                    r[i]+=n;
                    candies-=n;
                    n++;
                }else{
                    r[i]+=candies;
                    candies=0;
                    return r;
                }
            }
        }
        return r;
    }
}