class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n=costs.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=costs[i][1]-costs[i][0];
        }
        Arrays.sort(res);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=costs[i][0];
        }
        for(int i=0;i<n/2;i++){
            sum+=res[i];
        }
        return sum;
    }
}