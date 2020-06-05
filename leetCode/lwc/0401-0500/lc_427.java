package leetcode;

/**
 * @author lwc
 * @date 2019/12/30 16:02
 */
public class lc_427 {
    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {}

        public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
            val = _val;
            isLeaf = _isLeaf;
            topLeft = _topLeft;
            topRight = _topRight;
            bottomLeft = _bottomLeft;
            bottomRight = _bottomRight;
        }
    };

    public Node construct(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0){
            return null;
        }
        return help(grid, 0, 0, grid.length - 1, grid[0].length - 1);
    }

    public Node help(int[][] grid, int ti, int tj, int bi, int bj){
        if(same(grid, ti, tj, bi, bj) == 1){
            return new Node(grid[ti][tj] == 1, true, null, null, null, null);
        }
        int len1 = (bi - ti) / 2;
        int len2 = (bj - tj) / 2;

        Node topLeft = help(grid, ti, tj, ti + len1, tj + len2);
        Node topRight = help(grid, ti, bj - len2, ti + len1, bj);
        Node bottomLeft = help(grid, bi - len1, tj, bi, tj + len2);
        Node bottomRight = help(grid, bi - len1, bj - len2, bi, bj);
        return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
    }


    public int same(int[][] v, int ti, int tj, int bi, int bj){
        int mark = v[ti][tj];
        for(int i = ti; i <= bi; i++){
            for(int j = tj; j <= bj; j++){
                if(v[i][j] != mark){
                    return 0;
                }
            }
        }
        return 1;
    }
}
