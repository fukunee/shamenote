package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/12/2 9:42
 */
public class lc_310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        if(edges.length == 0 || edges[0].length == 0)
            return Arrays.asList(0);

        List[] edgeList = new List[n];
        for(int i = 0; i < n; i++){
            edgeList[i] = new ArrayList();
        }
        for(int[] edge : edges){
            edgeList[edge[0]].add(edge[1]);
            edgeList[edge[1]].add(edge[0]);
        }

        List<Integer> rs = new ArrayList<>();
        backTrack(rs, new ArrayList<>(), 0, edgeList);
        backTrack(rs, new ArrayList<>(), rs.get(rs.size()-1), edgeList);
        int max = rs.size();


        List<Integer> roots = new ArrayList<>();
        roots.add(rs.get(max/2));
        if(max % 2 == 0) roots.add(rs.get(max/2-1));
        return roots;
    }

    public void backTrack(List<Integer> rs, List<Integer> temp, int pos, List<Integer>[] edgeList){
        temp.add(pos);
        int count = 0;
        for(int value : edgeList[pos]){
            if(!temp.contains(value)){
                count++;
                backTrack(rs, temp, value, edgeList);
                temp.remove(temp.size()-1);
            }
        }
        if(count == 0 && temp.size() > rs.size()){
            rs.clear();
            rs.addAll(new ArrayList<>(temp));
        }
    }

    public List<Integer> findMinHeightTrees2(int n, int[][] edges) {
        int[] degree = new int[n];
        List<Integer>[] edgeList = new List[n];
        for(int i = 0; i < n; i++){
            edgeList[i] = new ArrayList();
        }

        for(int[] edge : edges){
            edgeList[edge[0]].add(edge[1]);
            edgeList[edge[1]].add(edge[0]);
            degree[edge[0]] ++;
            degree[edge[1]] ++;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 0; i < degree.length; i++){
            if(degree[i] <= 1){
                queue.offer(i);
            }
        }

        while(n > 2){
            int size = queue.size();
            while(size > 0) {
                n--;
                size--;
                int j = queue.poll();
                for (int k : edgeList[j]) {
                    degree[k]--;
                    if (degree[k] == 1)
                        queue.offer(k);
                }
            }
        }
        return new ArrayList<>(queue);
    }
}
