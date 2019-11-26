package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/11/19 9:50
 */
public class lc_207 {

    //BFS
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] edge = new List[numCourses];
        for(int i = 0; i < numCourses; i++){
            edge[i] = new ArrayList<>();
        }
        int[] degree = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            edge[prerequisites[i][0]].add(prerequisites[i][1]);
            degree[prerequisites[i][1]] += 1;
        }

        LinkedList<Integer> stack = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(degree[i] == 0) stack.push(i);
        }

        while(!stack.isEmpty()){
            int cur = stack.pop();
            res.add(cur);
            for(int val : edge[cur]){
                if(degree[val] == 1)
                    stack.push(val);
                degree[val] --;
            }
        }
        return res.size() == numCourses;
    }

    //DFS
    public boolean canFinish_2(int numCourses, int[][] prerequisites) {
        List<Integer>[] edge = new List[numCourses];
        for (int i = 0; i < numCourses; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < prerequisites.length; i++) {
            edge[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        int[] loop = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            if(loop[i] != -1 && !isNotCycle(loop, edge, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isNotCycle(int[] loop, List<Integer>[] edge, int cur){

        if(loop[cur] == -1) return true;
        if(loop[cur] == 1) return false;
        loop[cur] = 1;

        for(int val : edge[cur]) {
            if (!isNotCycle(loop, edge, val)) return false;
        }
        loop[cur] = -1;
        return true;
    }
}
