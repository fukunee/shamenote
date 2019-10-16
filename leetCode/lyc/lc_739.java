class Solution {
    public int[] dailyTemperatures(int[] T) {
        int n=T.length;
        int[] res=new int[n];
        res[n-1]=0;
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j+=res[j]){
                if(T[j]>T[i]){
                    res[i]=j-i;
                    break;
                }else if(res[j]==0){
                    res[i]=0;
                    break;
                }
            }
        }
        return res;
    }
}