package solution2;

import sun.awt.image.ImageWatched;

import java.util.*;

/**
 * @author lwc
 * @date 2019/11/2 17:12
 */
public class U131 {
    public List<List<String>> partition(String s) {
        char[] c = s.toCharArray();
        List<List<String>>[] v = new ArrayList[c.length + 1];
        List<List<String>> tempV = new ArrayList<>();
        tempV.add(new ArrayList<>());
        v[c.length] = tempV;

        for(int i = c.length - 1; i >= 0; i--){
            List<List<String>> curList = new ArrayList<>();
            for(int j = i + 1; j <= c.length; j++){
                String curStr = s.substring(i,j);
                if(isPalindrome(c,i,j-1) == 1){
                    for(List list : v[j]){
                        List<String> temp = new ArrayList<>();
                        temp.add(curStr);
                        temp.addAll(list);
                        curList.add(temp);
                    }
                }
            }
            v[i] = curList;
        }
        return v[0];
    }

    public int isPalindrome(char[] c, int start, int end){
        while(start < end){
            if(c[start] != c[end])
                return 0;
            start++;
            end--;
        }
        return 1;
    }
}
