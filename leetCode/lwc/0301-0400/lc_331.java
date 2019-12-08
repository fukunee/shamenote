package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2019/12/6 10:27
 */
public class lc_331 {
    public boolean isValidSerialization(String preorder) {
        List<String> pre = new ArrayList<>();
        Collections.addAll(pre, preorder.split(","));
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i < pre.size() - 2; i++){
                if(!pre.get(i).equals("#") && pre.get(i+1).equals("#") && pre.get(i+2).equals("#")){
                    pre.remove(i + 1);
                    pre.remove(i + 1);
                    pre.set(i,"#");
                    flag = true;
                }
            }
        }
        return pre.size() == 1 && pre.get(0).equals("#");
    }

    public boolean isValidSerialization2(String preloader) {
        int len = preloader.length();
        int count = 0;

        for (int i = 0; i < len; i ++) {
            if(preloader.charAt(i) == ',')
                continue;
            if (preloader.charAt(i) == '#') {
                count--;
            } else {
                while (i<len && preloader.charAt(i)!=',')
                    i++;
                count++;
            }
            if (count == -1 && i < len - 1)
                return false;
        }

        return count == -1 ? true : false;
    }

}
