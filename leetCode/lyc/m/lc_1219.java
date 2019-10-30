class Solution {
    public int getMaximumGold(int[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                res=Math.max(res,findmax(grid,i,j));
            }
        }
        return res;
    }
    public int findmax(int[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }
        int tag=grid[i][j];
        grid[i][j]=0;
        int up=findmax(grid,i-1,j);
        int down=findmax(grid,i+1,j);
        int left=findmax(grid,i,j-1);
        int right=findmax(grid,i,j+1);
        grid[i][j]=tag;
        return Math.max(Math.max(up,down),Math.max(left,right))+tag;
    }
}