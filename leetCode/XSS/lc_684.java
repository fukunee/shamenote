public class lc_684 {
    public static void main(String[] args) {
        //冗余连接，生成树,使用并查集可解决生成树问题
    }
    class Solution {
        public int[] parent = new int[1001];

        void init(){
            for(int i=0;i<1001;i++)
                parent[i] = i;
        }

        private int Find(int x){
            while(x != parent[x])
                x = parent[x];
            return x;
        }

        private void Merge(int x,int y){
            int a = Find(x);
            int b = Find(y);
            if(a != b){
                parent[a] = b;
            }
        }

        public int[] findRedundantConnection(int[][] edges) {
            init();
            int[] ans = new int[2];
            for(int i=0;i<edges.length;i++){
                int from = edges[i][0];
                int to = edges[i][1];
                if(Find(from) != Find(to)){
                    Merge(from,to);
                }else{
                    ans[0] = from;
                    ans[1] = to;
                }
            }
            return ans;
        }
    }
}
