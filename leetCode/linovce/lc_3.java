class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=0;
        int max=0;
        for(int i=0;i<s.length();){
            List<Character> list = new ArrayList<>();
            list.add(s.charAt(i));
            n++;
            for(int j=i+1;j<s.length();j++){
                if(list.contains(s.charAt(j))){
                    break;
                }
                    
                else{
                    list.add(s.charAt(j));
                    n++;
                }
            }
            i++;
            if(n>max)
                max=n;
            n=0;

            if(s.length()-i+1<=max)
                break;
        }
        return max;
    }
}