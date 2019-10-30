class Solution {
    public boolean isHappy(int n) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        while(n!=1){
            
            List<Integer> l = new ArrayList<>();
            
            while(n/10!=0){
                l.add(n%10);
                n=n/10;
            }
            l.add(n);
            n=0;
            
            for(int i=0;i<l.size();i++)
                n+=l.get(i)*l.get(i);
            
            Collections.sort(l);
            if(list.contains(l))
                return false;
            list.add(l);
        }
        
        return true;
    }
}