class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int n=0;
        
        for(int i=0,j=0;i<s.length&&j<g.length;){
            if(s[i]>=g[j]){
                i++;
                j++;
                n++;
            }
            else{
                i++;
            }
        }
        
        return n;
    }
}