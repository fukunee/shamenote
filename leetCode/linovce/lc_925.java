class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int j=0;
        int i=0;
        for(;i<name.length()&&j<typed.length();){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else if(i>0&&name.charAt(i-1)==typed.charAt(j)){
                j++;
            }else
                return false;
        }
        if(i!=name.length())
            return false;
        while(j<typed.length()){
            if(name.charAt(name.length()-1)!=typed.charAt(j))
                return false;
            j++;
        }
        return true;
    }
}