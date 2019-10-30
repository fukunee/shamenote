/*Long Pressed Name*/
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int m=name.length();
        int n=typed.length();
        if(m>n){
            return false;
        }
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else if(j>0&&typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }else{
                return false;
            }
        }
        return i==m;
    }
}