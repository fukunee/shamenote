class Solution {
    public int longestPalindrome(String s) {
        List<Character> list = new ArrayList<Character>();
        
        for(int i=0;i<s.length();i++){
            if(!list.contains(s.charAt(i)))
                list.add(s.charAt(i));
            else{
                list.remove((Character)s.charAt(i));
            }
        }
        
        if(list.size()!=0){
            return s.length()-list.size()+1;
        }
        return s.length()-list.size();
    }
}