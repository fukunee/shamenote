class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int num=0;
        int[] temp = new int[60];
        for(int i=0;i<time.length;i++){
            temp[time[i]%60]++;
        }
        num+=(temp[0]-1)*temp[0]/2;
        num+=(temp[30]-1)*temp[30]/2;
        for(int i=1;i<30;i++){
            if(temp[i]>=temp[60-i]){
                num+=temp[i]*temp[60-i];
                
            }                
            else{
                num+=temp[60-i]*temp[i];
                
            }
                
        }
        return num;
    }
}