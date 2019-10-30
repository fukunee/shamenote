/*Find the Town Judge*/
class Solution {
    public int findJudge(int N, int[][] trust) {
        if(trust.length==0&&N==1){
            return 1;
        }
        if(trust.length==0&&N!=1){
            return -1;
        }
        int[] out=new int[N+1];
        int[] in=new int[N+1];
        Arrays.fill(out,0);
        Arrays.fill(in,0);
        for(int i=0;i<trust.length;i++){
            out[trust[i][0]]+=1;
            in[trust[i][1]]+=1;
        }
        for(int i=1;i<=N;i++){
            if(out[i]==0&&in[i]==(N-1)){
                return i;
            }
        }
        return -1;
    }
}