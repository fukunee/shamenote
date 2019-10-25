class Solution {
    public int[][] generateMatrix(int n) {
        int[][] r = new int[n][n];
        int i=0;
        int j=0;
        int f=0;
        int x=1;
        while(x<=n*n){
            if(f==0){
                r[i][j]=x;
                j++;
                x++;
                if(j==n||r[i][j]!=0){
                    j--;
                    i++;
                    f=1;
                }
            }else if(f==1){
                r[i][j]=x;
                i++;
                x++;
                if(i==n||r[i][j]!=0){
                    i--;
                    j--;
                    f=2;
                }
            }else if(f==2){
                r[i][j]=x;
                j--;
                x++;
                if(j<0||r[i][j]!=0){
                    j++;
                    i--;
                    f=3;
                }
            }
            else if(f==3){
                r[i][j]=x;
                i--;
                x++;
                if(i<0||r[i][j]!=0){
                    i++;
                    j++;
                    f=0;
                }
            }
        }
        
        return r;
    }
}