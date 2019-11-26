package solution2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lwc
 * @date 2019/10/16 14:24
 */
public class U71 {
    public String simplifyPath(String path) {
        String[] strings = path.split("/");
        List<String> queue = new ArrayList<>();
        queue.add("/");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("") || strings[i].equals(".")) continue;
            else if (strings[i].equals("..")) {
                if (queue.size() > 1)
                    queue = queue.subList(0,queue.size()-2);
            } else {
                queue.add(strings[i]);
                queue.add("/");
            }
        }
        if (queue.size() > 1) queue = queue.subList(0,queue.size()-1);
        return queue.stream().collect(Collectors.joining(""));
    }
}
