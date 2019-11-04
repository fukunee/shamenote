package solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/11/2 22:15
 */
public class U132 {

    int[] v = new int[1];
    public int minCut(String s) {
        v[0] = s.length() - 1;
        backTrack(s,0, new ArrayList<>());
        return v[0];
    }
    public void backTrack(String s, int l, List<String> currLst){
        if(currLst.size()>0 && l>=s.length())
            v[0] = currLst.size() - 1 < v[0] ? currLst.size()-1 : v[0];
        for(int i=l;i<s.length();i++){
            if(isPalindrome(s,l,i)){
                if(l==i)
                    currLst.add(Character.toString(s.charAt(i)));
                else
                    currLst.add(s.substring(l,i+1));
                backTrack(s,i+1, currLst);
                currLst.remove(currLst.size()-1);
            }
        }
    }
    public boolean isPalindrome(String str, int l, int r){
        if(l==r) return true;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }
}
