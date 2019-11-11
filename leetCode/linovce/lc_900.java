class RLEIterator {
    int[] A;
    int index=-1;
    public RLEIterator(int[] A) {
        this.A=Arrays.copyOf(A,A.length);
        index=0;
    }
    
    public int next(int n) {
        for(int i=index;i<A.length-1;i=i+2){
            if(A[i]==n){
                index=i+2;
                return A[i+1];                
            }else if(A[i]>n){
                A[i]-=n;
                index=i;
                return A[i+1];
            }else{
                n=n-A[i];
                A[i]=0;
            }
                
        }
        
        return -1;
    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(A);
 * int param_1 = obj.next(n);
 */