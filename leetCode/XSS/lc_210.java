import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class lc_210 {
    //课程表2,拓扑解决最简易
    static class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            if(numCourses<=0)return new int[0];
            if(numCourses==1)return new int[]{0};
            //boolean [][]edgeIsT=new boolean[numCourses][numCourses];
            int []in=new int[numCourses];//入度
            //用hashset数组表示邻接表效率更好
            HashSet<Integer> edgeIsT[]=new HashSet[numCourses];
            for(int i=0;i<numCourses;i++)
            {
                edgeIsT[i]=new HashSet<>();
            }
            for(int []cp:prerequisites)
            {
                int x=cp[1];
                int y=cp[0];
                edgeIsT[x].add(y);
                //edgeIsT[x][y]=true;
                in[y]++;
            }
            int res[]=new int[numCourses];
            if(topology(edgeIsT,in,numCourses,res))
            {
                return res;
            }
            else return new int[0];

        }
        public boolean topology(HashSet<Integer> edge[],int in[],int n,int res[])
        {

            //int []out=new int[n];//出度
            int count=n;
            Queue<Integer> queue=new LinkedList();
            for(int i=0;i<n;i++)
            {
                if(in[i]==0)queue.offer(i);
            }
            while (!queue.isEmpty())
            {
                int p=queue.poll();
                res[n-count]=p;
                count--;
                    for (Integer i:edge[p])
                    {
                        in[i]--;
                        if(in[i]==0)queue.offer(i);
                    }
                            }
            if(count==0)return true;
            else return false;
        }
    }
}
