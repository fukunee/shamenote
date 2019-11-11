/*Longest Palindrome*/
class Solution {
    public int longestPalindrome(String s) {
        if(s == null){
            return 0;
        }
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);  
        }
        
        int sum = 0;
        int tag = 0;
        for(char str : map.keySet()){
            if(map.get(str) % 2 == 0){
                sum += map.get(str);
                map.put(str,0);
            }else{
                sum += (map.get(str) - 1);
                tag++;
            }
        }
        if(tag != 0){
            sum += 1;
        }
        return sum;
    }
}