import java.util.*;

public class lc_310 {
    public static void main(String[] args) {
        //最小高度树，dfs遍历节点，找出各个节点的最大遍历深度，找出最大遍历深度 最小的点，超时
        //最小高度树的根节点数量要么为1要么为2，使用bfs去除叶子节点，类拓扑
    }
    static class Solution {
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {

            List<Integer> res=new ArrayList<>();
            //int max_dfs_depth[]=new int[n];
            HashSet<Integer> edge[]=new HashSet[n];
            HashSet<Integer> set=new HashSet<>();
            //int isUsed[]=new int[n];
            int in[]=new int[n];
            for(int i=0;i<n;i++)
            {
                edge[i]=new HashSet<>();
                set.add(i);
            }
            for(int i=0;i<edges.length;i++)
            {
                edge[edges[i][0]].add(edges[i][1]);
                edge[edges[i][1]].add(edges[i][0]);
                in[edges[i][0]]++;
                in[edges[i][1]]++;
            }
            /*
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                dfs(edge,n,i,0,max_dfs_depth,isUsed,i);
                min=Math.min(min,max_dfs_depth[i]);
            }
            for(int i=0;i<n;i++)
            {
                if(min==max_dfs_depth[i])res.add(i);
            }
            return res;
             */
            if(set.size()>2)bfsDeleteLeaf(edge,in,set,n);
            return new ArrayList<>(set);
        }
        public boolean dfs(HashSet<Integer>[]edges,int n,int index,int depth,int mdd[],int isUsed[],int origin)
        {
            if(isUsed[index]==1)
            {
                return false;
            }

            isUsed[index]=1;
            mdd[origin]=Math.max(mdd[origin],depth+1);
            for(Integer i:edges[index])
            {
                dfs(edges,n,i,depth+1,mdd,isUsed,origin);
            }
            isUsed[index]=0;
            return true;
        }
        public void bfsDeleteLeaf(HashSet<Integer>edge[],int in[],HashSet<Integer>set,int n)
        {
            Queue <Integer>queue=new LinkedList<>();
            int floor=0,nextfloor=0,leafnum=0;
            for(int i=0;i<n;i++)
            {
                if(in[i]==1)
                {
                    floor++;
                    queue.offer(i);
                }
            }
            while (!queue.isEmpty())
            {
                int leaf=queue.poll();
                leafnum++;
                set.remove(leaf);
                for(Integer j:edge[leaf]) {
                    in[j]--;
                    if(in[j]==1) {
                        queue.offer(j);
                        nextfloor++;
                    }
                }
                if(leafnum==floor)
                {
                    floor=nextfloor;
                    nextfloor=0;
                    leafnum=0;
                    if(set.size()<=2)return;
                }
            }
        }
    }
}
