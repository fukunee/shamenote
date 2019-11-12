//给一个有 n 个结点的有向无环图，找到所有从 0 到 n-1 的路径并输出（不要求按顺序）
//
// 二维数组的第 i 个数组中的单元都表示有向图中 i 号结点所能到达的下一些结点（译者注：有向图是有方向的，即规定了a→b你就不能从b→a）空就是没有下一个结点了。 
//
// 示例:
//输入: [[1,2], [3], [3], []] 
//输出: [[0,1,3],[0,2,3]] 
//解释: 图是这样的:
//0--->1
//|    |
//v    v
//2--->3
//这有两条路: 0 -> 1 -> 3 和 0 -> 2 -> 3.
// 
//
// 提示: 
//
// 
// 结点的数量会在范围 [2, 15] 内。 
// 你可以把路径以任意顺序输出，但在路径内的结点的顺序必须保证。 
// 
//

package cn;

import java.util.*;

public class AllPathsFromSourceToTarget {
    public static void main(String[] args) {

        Solution solution = new AllPathsFromSourceToTarget().new Solution();
        //int[][] a = {{1,2},{3},{3},{4},{}};
        //int[][] a = {{3,1},{4,6,7,2,5},{4,6,3},{6,4},{7,5},{6},{7},{}};
        int[][] a = {{1, 2}, {3}, {3}, {}};
        solution.allPathsSourceTarget(a);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            /**
             * 20%，因为有重复计算，我把问题想复杂了，这就是一个有向无环图，济宁一个dfs就可以了，
             * 下面是一个dfs的递归写法
             */
        /*versin1
        List<List<Integer>> ret = new ArrayList<>();
        int[] dep = new int[16];
        int i = 1, j = 0, n = graph.length-2, target = 0, find = 0;
        Stack<Integer> stack = new Stack<>();
        stack.add(n+1);
        while(!stack.empty()){
            target = stack.peek();
            find = 0;
            for(i = n; i >= 0; i--){
                for(j = 0; j < graph[i].length; j++){
                    if(graph[i][j] == target){
                        stack.add(i);
                        dep[target] = i;
                        find = 1;
                        n = i-1;
                        if(i == 0){
                            List<Integer> list = new ArrayList<>(stack);
                            Collections.reverse(list);
                            System.out.println("i="+i+" j="+j);
                            System.out.println("list="+list);
                            ret.add(list);
                            stack.pop(); //去0
                            n = dep[stack.peek()]-1;
                            System.out.println("n="+n+"  stack="+stack);
                        }
                        i = -1;
                        break;
                    }
                }
            }
            if(find == 0 && !stack.empty()){
                stack.pop();
                if(stack.empty()) return  ret;
                n = dep[stack.peek()]-1;
            }
            else if(find == 0) return ret;
        }
        return ret;
        version1
         */
            //return solve(graph, 0); 官方解法version2
            /**
             * version3
             * 新产生了一个想法，去查找，维护一个进入该节点的表，
             * 然后就是一个前序遍历，这种做法比直接dfs好的地方就是没有任何浪费时间的地方
             * 不需要回溯
             * 就看能不能写出来了
             * 20%wdnmd
             * 试试用迭代写一个dfs，题解的dfs是正向的，我是反向的
             * 我在想是不是因为反向的建表花了太多时间
             */
            /*versin3
            int i = 0, j = 0, n = graph.length, temp = 0, max = n - 1, current = n;
            //进入该节点的节点
            ArrayList<Integer>[] into = new ArrayList[n];
            for (; i < n; i++)
                into[i] = new ArrayList<>();
            //计算这个节点已经被访问了几棵子树
            int[] count = new int[n];
            //保存这个节点总共有几棵子树
            int[] tot = new int[n];
            //先序遍历，保存上一个节点
            Stack<Integer> stack = new Stack<>();
            //方法返回值
            List<List<Integer>> ret = new ArrayList<>();
            //初始化进入节点表和计算每个节点入度
            for (i = 0; i < n; i++) {
                for (j = 0; j < graph[i].length; j++) {
                    into[graph[i][j]].add(i);
                    tot[graph[i][j]]++;
                }
            }
            stack.add(max);
            while (!stack.empty()) {
                temp = stack.peek();
                while (temp != 0) {
                    //所有子树都被遍历，就弹出这个节点，重置计算节点已访问的子树数量
                    if (count[temp] == tot[temp]) {
                        stack.pop();
                        count[temp] = 0;
                    }
                    //否则，进入这个节点目前的第一个未被访问的子树,并增加已经访问子树数量
                    else {
                        stack.add(into[temp].get(count[temp]));
                        count[temp]++;
                    }
                    if(stack.empty()) return ret;
                    temp = stack.peek();
                }
                //如果访问到0，将这个访问顺序逆序之后加入结果ret，然后弹出0
                List<Integer> list = new ArrayList<>(stack);
                Collections.reverse(list);
                System.out.println(list);
                ret.add(list);
                stack.pop();
            }
            return ret;
            versin3
             */
            /**
             * versin4正向递归改写迭代 也是20%左右，佛了
             * 如果就用List<Integer>呢，不用stack试试
             */
            /*version4
            int i = 0, j = 0, n = graph.length, max = n-1, temp = 0;
            List<List<Integer>> ret = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            int[] count = new int[n];
            stack.add(0);
            while(!stack.empty()){
                temp = stack.peek();
                while(temp != max){
                    if(count[temp] == graph[temp].length){
                        stack.pop();
                        count[temp] = 0;
                    }
                    else{
                        stack.add(graph[temp][count[temp]]);
                        count[temp]++;
                    }
                    if(stack.empty()) return ret;
                    temp = stack.peek();
                }
                List<Integer> list = new ArrayList<>(stack);
                ret.add(list);
                System.out.println(list);
                stack.pop();
            }
            return ret;
            version4
             */
            /**
             * 不用stack version5 70ms 5% 无语了
             */
            int i = 0, j = 0, n = graph.length, max = n-1, temp = 0;
            List<List<Integer>> ret = new ArrayList<>();
            //用int[]代替stack，j表示最右有效位
            int[] stack = new int[n];
            int[] count = new int[n];
            stack[0] = 0;

            while(j != -1){
                temp = stack[j];
                while(temp != max){
                    if(count[temp] == graph[temp].length){
                        j--;
                        count[temp] = 0;
                    }
                    else{
                        stack[++j] = graph[temp][count[temp]];
                        count[temp]++;
                    }
                    if(j == -1) return ret;
                    temp = stack[j];
                }
                List<Integer> list = new ArrayList<>();
                for(i = 0; i <= j; i++)
                    list.add(stack[i]);
                ret.add(list);
                System.out.println(list);
                j--;
            }
            return ret;
        }

        /**
         * 官方解法，48%，我觉得可能可以尝试将递归改成迭代试试
         * @param graph
         * @param node
         * @return
         */
    /*version2
    public List<List<Integer>> solve(int[][] graph, int node) {
        int N = graph.length;
        List<List<Integer>> ans = new ArrayList();
        if (node == N - 1) {
            List<Integer> path = new ArrayList();
            path.add(N-1);
            ans.add(path);
            return ans;
        }

        for (int nei: graph[node]) {
            for (List<Integer> path: solve(graph, nei)) {
                path.add(0, node);
                ans.add(path);
            }
        }
        return ans;
    }

     */

    }
//leetcode submit region end(Prohibit modification and deletion)

}