import java.util.*;

public class lc_207 {
    public static void main(String[] args) {
//课程表问题，可建图判断图有无回路来解决 1.拓扑排序 2.dfs
    }
    static class Solution {

        public boolean canFinish(int numCourses, int[][] prerequisites) {
            //Map<String,Integer> map=new HashMap<>();
            int row=prerequisites.length;
            if(row<=0)return true;
            int col=prerequisites[0].length;
            if(col<=1)return true;
            boolean [][]edgeIsT=new boolean[numCourses][numCourses];
            for(int []cp:prerequisites)
            {
                int x=cp[0];
                int y=cp[1];
                edgeIsT[x][y]=true;
            }
            int[]isUsed=new int [numCourses];
            /*
            for(int i=0;i<numCourses;i++)
            {
                if(!dfs(edgeIsT,isUsed,numCourses,i))return false;
            }
            return true;
             */
            return topology(edgeIsT,numCourses);
        }
        public boolean dfs(boolean [][]edge,int isUsed[],int n,int index)
        {

            if(isUsed[index]==1)return false;
            if(isUsed[index]==-1)return true;
            isUsed[index]=1;
            for(int j=0;j<n;j++)
            {
                if(edge[index][j]) {
                    if (!dfs(edge, isUsed, n, j)) return false;
                    //isUsed[index]=false;
                }
            }
            isUsed[index]=-1;
            return true;
        }
        public boolean topology(boolean edge[][],int n)
        {
            int []in=new int[n];//入度
            //int []out=new int[n];//出度
            int count=n;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(edge[i][j])
                    {
                        in[j]++;
                        //out[i]++;
                    }
                }
            }
            Queue<Integer>queue=new LinkedList();
            for(int i=0;i<n;i++)
            {
                if(in[i]==0)queue.offer(i);
            }
            while (!queue.isEmpty())
            {
                int p=queue.poll();
                count--;
                for(int i=0;i<n;i++)
                {
                    if(edge[p][i])
                    {
                        in[i]--;
                        if(in[i]==0)queue.offer(i);
                    }
                }
            }
            if(count==0)return true;
            else return false;
        }
    }
}
