class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int f=0;
        int l=letters.length-1;
        int mid=0;
        if(letters[l]<=target||target<letters[0])
            return letters[0];
        
        while(f<l){
            mid=(f+l)/2;
            
            if(letters[mid]<=target){
                if(mid+1<=letters.length-1&&letters[mid+1]>target)
                    return letters[mid+1];
                else
                    f=mid+1;
            }else if(letters[mid]>=target){
                if(mid-1>=0&letters[mid-1]<=target)
                    return letters[mid];
                else
                    l=mid-1;
            }
        }
        
        return letters[0];
    }
}