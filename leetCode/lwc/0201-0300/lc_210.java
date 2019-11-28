package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/11/20 10:23
 */
public class lc_210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<Integer>[] edge = new List[numCourses];
        for(int i = 0; i < numCourses; i++){
            edge[i] = new ArrayList<>();
        }
        int[] degree = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            edge[prerequisites[i][1]].add(prerequisites[i][0]);
            degree[prerequisites[i][0]] += 1;
        }

        LinkedList<Integer> stack = new LinkedList<>();
        int[] res = new int[numCourses];
        int size = 0;
        for(int i = 0; i < numCourses; i++){
            if(degree[i] == 0) stack.push(i);
        }

        while(!stack.isEmpty()){
            int cur = stack.pop();
            res[size++] = cur;
            for(int val : edge[cur]){
                if(degree[val] == 1)
                    stack.push(val);
                degree[val] --;
            }
        }
        return size == numCourses ? res : new int[0];
    }
}
