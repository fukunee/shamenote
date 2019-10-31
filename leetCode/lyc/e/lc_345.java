/*Reverse Vowels of string*/
class Solution {
    public String reverseVowels(String s) {
        StringBuilder res= new StringBuilder();
        for(char c:s.toCharArray()){
            res.append(c);
        }
        int l=0;
        int r=s.length()-1;
        while(l<r){
            while(l<r&&!isvowels(s.charAt(l))){l++;}
            while(l<r&&!isvowels(s.charAt(r))){r--;}
            char temp=s.charAt(l);
            res.setCharAt(l,s.charAt(r));
            res.setCharAt(r,temp);
            
            l++;
            r--;
        }
        return res.toString();
    }
    public boolean isvowels(char c){
       char[] vowels=new char[]{'a','e','i','o','u','A','E','I','O','U'};
       for(int i=0;i<vowels.length;i++){
           if(c==vowels[i]){
               return true;
           }
       }
        return false;
    }
}