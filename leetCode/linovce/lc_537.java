class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] A = a.split("\\+|i");
        String[] B = b.split("\\+|i");
        
        int x = Integer.parseInt(A[0])*Integer.parseInt(B[0])-Integer.parseInt(A[1])*Integer.parseInt(B[1]);
        
        int y = Integer.parseInt(A[0])*Integer.parseInt(B[1])+Integer.parseInt(A[1])*Integer.parseInt(B[0]);
        
        String s = String.valueOf(x)+"+"+String.valueOf(y)+"i";
        return s;
    }
}