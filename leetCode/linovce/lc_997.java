class Solution {
    public int findJudge(int N, int[][] trust) {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<N;i++){
            List<Integer> l = new ArrayList<>();
            l.add(-1);
            list.add(l);
        }
        System.out.println(list);
        
        for(int i=0;i<trust.length;i++){
            List<Integer> l = list.get(trust[i][0]-1);
            l.add(trust[i][1]-1);
            list.set(trust[i][0]-1,l);
        }
        System.out.println(list);
        
        int p=-1;
        int f=1;
        
        for(int i=0;i<list.size();i++){
            if(list.get(i).size()==1){
                p=i+1;
                for(int j=0;j<list.size();j++){
                    if(i!=j&&!list.get(j).contains(i)){
                        f=0;
                        break;
                    }
                }
                
                if(f==1)
                    return p;
                else
                    f=1;
            }
        }
        
        return -1;
    }
}