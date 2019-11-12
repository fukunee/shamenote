public class lc_785 {
    public static void main(String[] args) {
        //判断二分图，使用dfs染色法，也可bfs遍历染色
    }
    static class Solution {
        public boolean isBipartite(int[][] graph)
        {
            int len=graph.length;
            int color[]=new int[len];
            for(int i=0;i<len;i++)
            {
                if(color[i]==0) {
                    if(!dfs(graph, i,1,color))return false;
                }
            }
            return true;
        }
        public boolean dfs(int [][]g,int index,int precolor,int color[])
        {
            color[index]=-precolor;
            for(int i=0;i<g[index].length;i++)
            {
               int node=g[index][i];
               if(color[node]==0)
               {
                  if(!dfs(g,node,color[index],color))return false;
               }
               else if(color[node]==color[index])return false;
            }
            return true;
        }
    }
}
