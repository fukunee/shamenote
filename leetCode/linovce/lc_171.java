class Solution {
    public int titleToNumber(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char c='A';
        for(int i=1;i<=26;i++){
            map.put(c,i);
            c++;
        }
        int n=1;
        int num=0;
        for(int i=s.length()-1;i>=0;i--){
            num+=map.get(s.charAt(i))*n;
            n=n*26;
        }
        return num;
    }
}