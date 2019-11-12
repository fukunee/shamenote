import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class lc_743 {
    public static void main(String[] args) {
        //网络延迟时间，最短路径问题
        //数据结构可以优化，效率超9%
        int times[][]=new int [][]{{2,1,1},{2,3,1},{3,4,1}};
        System.out.println(new Solution().networkDelayTime(times,4,2));
    }
    static class Solution {
        public int networkDelayTime(int[][] times, int N, int K) {
            return Dijkstra(times,N,K);
        }

        public int Dijkstra(int [][]edges,int N,int K)
        {
            int dist[]=new int[N];
            K=K-1;
            for(int i=0;i<N;i++)
            {
                dist[i]=Integer.MAX_VALUE;
            }
            HashMap<Integer,Integer> node[]=new HashMap[N];
            HashSet<Integer> visited=new HashSet<>();
            //boolean visited[]=new boolean[N];
            for(int i=0;i<N;i++)
            {
                node[i]=new HashMap<>();
            }
            for(int i=0;i<edges.length;i++)
            {
                int i0=edges[i][0],i2=edges[i][1],i3=edges[i][2];
                node[i0-1].put(i2-1,i3);
                //System.out.println("边"+String.valueOf(i0-1)+"->"+String.valueOf(i2-1));
            }
            //int index=K;
            dist[K]=0;
            visited.add(K);
            for(int i=0;i<N-1;i++)
            {
                int min=Integer.MAX_VALUE;int mNode=-1;int mindex=-1;
                for(int index:visited)
                {
                    for(Integer n1:node[index].keySet()){
                        if(!visited.contains(n1)&&node[index].get(n1)+dist[index]<min)
                        {
                            min=Math.min(min,node[index].get(n1)+dist[index]);mNode=n1;mindex=index;
                            //System.out.println(String.valueOf(mindex+1)+"->"+String.valueOf(mNode+1)+"  长度："+min);
                        }
                    }
                }
                if(mNode!=-1&&mindex!=-1)
                {
                    dist[mNode]=min;
                    //System.out.println("选择边："+String.valueOf(mindex+1)+"->"+String.valueOf(mNode+1)+"  距离："+dist[mNode]);
                    visited.add(mNode);
                }
            }
            int res=Integer.MIN_VALUE;
            for(int i=0;i<N;i++)
            {
                //System.out.println(dist[i]);
                res=Math.max(res,dist[i]);
            }
            if(res==Integer.MAX_VALUE)
            {
                return -1;
            }
            return res;
        }
    }
}
