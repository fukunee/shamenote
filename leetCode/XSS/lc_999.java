public class lc_999 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int numRookCaptures(char[][] board) {
            int row=board.length;
            int col=board[0].length;
            int x=-1,y=-1;
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    if(board[i][j]=='R')
                    {
                        x=i;y=j;i=row;j=col;
                    }
                }
            }
            if(x==-1)return 0;
            int res=0;
            for(int i=x;i>=0;i--)
            {
                if(board[i][y]=='.')continue;
                if(board[i][y]=='B')break;
                if(board[i][y]=='p')
                {
                    res++;
                    break;
                }
            }
            for(int i=x;i<row;i++)
            {
                if(board[i][y]=='.')continue;
                if(board[i][y]=='B')break;
                if(board[i][y]=='p')
                {
                    res++;
                    break;
                }
            }
            for(int j=y;j>=0;j--)
            {
                if(board[x][j]=='.')continue;
                if(board[x][j]=='B')break;
                if(board[x][j]=='p')
                {
                    res++;break;
                }
            }
            for(int j=y;j<col;j++)
            {
                if(board[x][j]=='.')continue;
                if(board[x][j]=='B')break;
                if(board[x][j]=='p')
                {
                    res++;break;
                }
            }
            return res;
        }
    }
}
