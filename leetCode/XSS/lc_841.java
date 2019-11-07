import java.util.HashSet;
import java.util.List;

public class lc_841 {
    public static void main(String[] args) {

    }
    static class Solution {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            int len=rooms.size();
            HashSet<Integer> edges[]=new HashSet[len];
            for(int i=0;i<len;i++)
            {
                edges[i]=new HashSet<>();
            }
            for(int i=0;i<len;i++)
            {
                for(Integer j:rooms.get(i))
                {
                    edges[i].add(j);
                }
            }
            int visited[]=new int[len];
            int num[]=new int[len];

            dfs(edges,visited,0,num);
            for(int i=0;i<len;i++)
            {
                if(visited[i]==0)return false;
            }
            return true;
        }
        public void dfs(HashSet<Integer>edges[],int visited[],int  index,int num[])
        {
            visited[index]=1;
            for(Integer i:edges[index])
            {
                if(visited[i]==0)
                {
                    dfs(edges,visited,i,num);
                }
            }

        }
    }
}
