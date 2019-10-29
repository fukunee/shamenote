class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length;
        while(left<right){
            int mid=(left+right)>>>1;
            if(target<letters[mid]){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        if(left==letters.length){
            return letters[0];
        }else{
            return letters[left];
        }
        
    
    }
}