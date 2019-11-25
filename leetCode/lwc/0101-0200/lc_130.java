package solution2;

import javafx.scene.effect.Light;
import javafx.util.Pair;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author lwc
 * @date 2019/10/31 23:06
 */
public class U130 {
    public void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0) return;
        int x = board.length;
        int y = board[0].length;
        int[][] v = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(i == 0 || j == 0 || i == x-1 || j == y-1){
                    if(board[i][j] == 'O' && v[i][j] == 0){
                        Queue<Pair<Integer,Integer>> queue = new ArrayDeque<>();
                        queue.add(new Pair<>(i,j));
                        v[i][j] = 1;
                        while(!queue.isEmpty()){
                            Pair<Integer,Integer> node = queue.remove();
                            int p1 = node.getKey();
                            int p2 = node.getValue();
                            if(p1 - 1 > 0 && board[p1-1][p2] == 'O' && v[p1-1][p2]==0) {
                                queue.add(new Pair<>(p1 - 1, p2));
                                v[p1-1][p2] = 1;
                            }

                            if(p1 + 1 < x && board[p1+1][p2] == 'O' && v[p1+1][p2]==0) {
                                queue.add(new Pair<>(p1 + 1, p2));
                                v[p1+1][p2] = 1;
                            }

                            if(p2 - 1 > 0 && board[p1][p2-1] == 'O' && v[p1][p2-1]==0) {
                                queue.add(new Pair<>(p1, p2 - 1));
                                v[p1][p2-1] = 1;
                            }

                            if(p2 + 1 < y && board[p1][p2+1] == 'O' && v[p1][p2+1]==0) {
                                queue.add(new Pair<>(p1, p2 + 1));
                                v[p1][p2+1] = 1;
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(board[i][j] == 'O' && v[i][j] == 0){
                    board[i][j] = 'X';
                }
            }
        }
    }

}
