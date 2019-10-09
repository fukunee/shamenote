class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[][] tjx = new int [2][grid.length];
        for(int i=0;i<grid.length;i++){
            int max=grid[i][0];
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]>max)
                    max=grid[i][j];
            }
            tjx[0][i] = max;
        }
        
        for(int i=0;i<grid[0].length;i++){
            int max=grid[0][i];
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]>max)
                    max=grid[j][i];
            }
            tjx[1][i] = max;
        }
        int num=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<tjx[0][i]&&grid[i][j]<tjx[1][j]){
                    num+=(tjx[0][i]-grid[i][j])>(tjx[1][j]-grid[i][j])?(tjx[1][j]-grid[i][j]):(tjx[0][i]-grid[i][j]);
                }
                    
            }
        }
        
        return num;
    }
}