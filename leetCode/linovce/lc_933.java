class RecentCounter {
    List<Integer> list;
    public RecentCounter() {
        list = new ArrayList<>();
    }
    
    public int ping(int t) {
        if(list.size()==0){
            list.add(t);
            return 1;
        }else{
            list.add(t);
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)>=t-3000){
                    return list.size()-i;
                }
            }
            return 1;
        }
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */